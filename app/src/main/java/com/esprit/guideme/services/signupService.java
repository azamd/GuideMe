package com.esprit.guideme.services;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.room.Room;

import com.esprit.guideme.dao.UserDao;
import com.esprit.guideme.database.DataBase;
import com.esprit.guideme.database.DataBaseTask;
import com.esprit.guideme.entity.LoggedInUser;
import com.esprit.guideme.entity.User;
import com.esprit.guideme.utils.GeneralUtils;

import java.io.IOException;
import java.util.concurrent.ExecutionException;


import okhttp3.*;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class signupService {
    public String TAG = "##SERVICE";
    private Context ctx;
    private DataBase db;
    public signupService(Context ctx){
        this.ctx = ctx;
    }

    public String resetPasswd(String email) {
        this.db = Room.databaseBuilder(this.ctx, DataBase.class, DataBase.local_db_name).build();
        OkHttpClient client = new OkHttpClient();
        final String[] returnval = {""};
        @SuppressLint("StaticFieldLeak") DataBaseTask dt = new DataBaseTask() {
            @Override
            protected Void doInBackground(Void... voids) {
                UserDao userDao = db.userDao();
                User uu = userDao.findByEmail(email);
                if (uu != null) {
                    OkHttpClient client= new OkHttpClient();
                    Request request = new Request.Builder()
                            .url("https://social-art.onrender.com/reset/" + email + "/" + uu.getPassword())
                            .build();
                    client.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {
                            returnval[0] = "An error occured";
                            e.printStackTrace();
                        }

                        @Override
                        public void onResponse(Call call, Response response) throws IOException {
                            returnval[0] = "Success! an email was sent containing your password.";
                        }
                    });
                }
                return null;
            }
        };
        try {
            dt.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnval[0];
    }

    public String createNewUser(User user) {
        this.db = Room.databaseBuilder(this.ctx, DataBase.class, DataBase.local_db_name).build();
        Log.d(this.TAG, user.toString());
        final String[] error = {""};
        // check if user already exists with email
        @SuppressLint("StaticFieldLeak") DataBaseTask dt = new DataBaseTask() {
            @Override
            protected Void doInBackground(Void... voids) {
                UserDao userDao = db.userDao();
                if(!GeneralUtils.checkSignUpForm(user)){
                    error[0] = "Sorry, Your inputs seem to be wrong. Check again.";
                    return null;
                }
                if(userDao.findByEmail(user.getEmail()) == null) {
                    userDao.insertAll(user);
                    user.setLoggedIn(true);
                    userDao.update(user);
                    LoggedInUser.connect(user);
                    SharedPreferences sharedPref = ctx.getSharedPreferences("last_loggedin_user_id", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putInt("id", user.getUid());
                    editor.apply();
                    Log.d(TAG, "doInBackground: " + userDao.getAll());
                }else{
                    error[0] = "Sorry, the user already exists.";
                }
                return null;
            }
        };
        try {
            dt.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return error[0];
    }
    public String login(String email, String password){
        this.db = Room.databaseBuilder(this.ctx, DataBase.class, DataBase.local_db_name).build();
        final String[] error = {""};
        // check if user already exists with email
        @SuppressLint("StaticFieldLeak") DataBaseTask dt = new DataBaseTask() {
            @Override
            protected Void doInBackground(Void... voids) {
                UserDao userDao = db.userDao();
                User u = userDao.findByEmail(email);
                if((u == null) || (!u.getPassword().equals(password))) {
                    error[0] = "Sorry! Either your password or your email is incorrect.";
                }else{
                    u.setLoggedIn(true);
                    userDao.update(u);
                    LoggedInUser.connect(u);
                    SharedPreferences sharedPref = ctx.getSharedPreferences("last_loggedin_user_id", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putInt("id", u.getUid());
                    editor.apply();
                    Log.d(TAG, "doInBackground: " + userDao.getAll());
                }
                return null;
            }
        };
        try {
            dt.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return error[0];
    }
    public String isLoggedIn(){
        this.db = Room.databaseBuilder(this.ctx, DataBase.class, DataBase.local_db_name).build();
        final String[] error = {""};
        // check if user already exists with email
        @SuppressLint("StaticFieldLeak") DataBaseTask dt = new DataBaseTask() {
            @Override
            protected Void doInBackground(Void... voids) {
                UserDao userDao = db.userDao();
                SharedPreferences sharedPref = ctx.getSharedPreferences("last_loggedin_user_id", Context.MODE_PRIVATE);
                int last_id = sharedPref.getInt("id", -1);
                if(last_id == -1) error[0] = "false";
                User u  = userDao.findById(last_id);
                if(u == null){
                    error[0] = "false";
                }else{
                    LoggedInUser.connect(u);
                    Log.d(TAG, "doInBackground: last id" + last_id + " user is " + u.toString());
                    error[0] = "true";
                }
                return null;
            }
        };
        try {
            dt.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return error[0];
    }
    public void logout(){
        User uss = new User();
        uss.setUid(1);
        this.db = Room.databaseBuilder(this.ctx, DataBase.class, DataBase.local_db_name).build();
        final String[] error = {""};
        // check if user already exists with email
        @SuppressLint("StaticFieldLeak") DataBaseTask dt = new DataBaseTask() {
            @Override
            protected Void doInBackground(Void... voids) {
                UserDao userDao = db.userDao();
                User u = userDao.findById(uss.getUid());
                if(u == null) {
                    Log.d(TAG, "wrong user id when loggin out");
                }else{
                    u.setLoggedIn(false);
                    userDao.update(u);
                    LoggedInUser.disconnect();
                    SharedPreferences sharedPref = ctx.getSharedPreferences("last_loggedin_user_id", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.remove("id");
                    editor.apply();
                    Log.d(TAG, "logged out successfully " );
                }
                return null;
            }
        };
        try {
            dt.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
