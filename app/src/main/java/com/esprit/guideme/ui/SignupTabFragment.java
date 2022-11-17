package com.esprit.guideme.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.esprit.guideme.services.signupService;
import com.esprit.guideme.R;
import com.esprit.guideme.entity.User;

public class SignupTabFragment extends Fragment {
    EditText email,password,confirmpassword,lastname,firstname;
    Button signup;
    Switch isAdmin;
    float v=0;
    com.esprit.guideme.services.signupService signupService;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) getLayoutInflater().inflate(R.layout.fragment_signup_tab, container, false);

        signupService = new signupService(getActivity().getApplicationContext());
        email = root.findViewById(R.id.email);
        lastname = root.findViewById(R.id.lastname);
        firstname = root.findViewById(R.id.firstname);
        password = root.findViewById(R.id.password);
        confirmpassword = root.findViewById(R.id.confirmpassword);
        signup = root.findViewById(R.id.button);
        isAdmin= root.findViewById(R.id.isAdmin);

        email.setTranslationX(800);
        password.setTranslationX(800);
        lastname.setTranslationX(800);
        firstname.setTranslationX(800);
        confirmpassword.setTranslationX(800);
        signup.setTranslationX(800);

        email.setAlpha(v);
        password.setAlpha(v);
        confirmpassword.setAlpha(v);
        firstname.setAlpha(v);
        lastname.setAlpha(v);
        signup.setAlpha(v);

        firstname.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        lastname.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        confirmpassword.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(800).start();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(password.getText().toString().equals(confirmpassword.getText().toString())) {
                    User user = new User(0, firstname.getText().toString(), lastname.getText().toString(), email.getText().toString(), password.getText().toString(), isAdmin.isChecked());
                    String return_val = signupService.createNewUser(user);
                    if(!return_val.equals("")){
                        Toast.makeText(getActivity().getApplicationContext(),return_val,Toast.LENGTH_SHORT).show();
                    }else{
                        //signup succeeded!!
                        Toast.makeText(getActivity().getApplicationContext(),"COngrats! Your new account was made.",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getActivity(), MainActivity2.class);// New activity
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        getActivity().finish(); // Call once you redirect to another activity
                    }
                }else{
                    Toast.makeText(getActivity().getApplicationContext(),"Sorry, your password doesn't match.",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return root;
    }
}
