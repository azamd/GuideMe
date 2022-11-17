package com.esprit.guideme.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.esprit.guideme.R;
import com.esprit.guideme.services.signupService;
import com.esprit.guideme.utils.GeneralUtils;

public class LoginTabFragment extends Fragment {
    EditText email,password;
    Button login;
    TextView forgetpassword;
    float v=0;
    signupService signupService;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) getLayoutInflater().inflate(R.layout.fragment_login_tab, container, false);

        signupService = new signupService(getActivity().getApplicationContext());
        email = root.findViewById(R.id.email);
        password = root.findViewById(R.id.password);
        forgetpassword = root.findViewById(R.id.forgotpassword);
        login = root.findViewById(R.id.button);

        email.setTranslationX(800);
        password.setTranslationX(800);
        forgetpassword.setTranslationX(800);
        login.setTranslationX(800);

        email.setAlpha(v);
        password.setAlpha(v);
        forgetpassword.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgetpassword.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(GeneralUtils.isEmail(email.getText().toString())){
                    signupService.resetPasswd(email.getText().toString());
                    Toast.makeText(getActivity().getApplicationContext(),"Success! an email was sent containing your password.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getActivity().getApplicationContext(),"Please write your email to be able to reset your password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("") || password.getText().toString().equals("")){
                    Toast.makeText(getActivity().getApplicationContext(),"Please write your credentials correctly!", Toast.LENGTH_SHORT).show();
                }else{
                    String return_val = signupService.login(email.getText().toString(), password.getText().toString());
                    if(return_val.equals("")){
                        //successfull login
                        Intent intent = new Intent(getActivity(), MainActivity2.class);// New activity
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        getActivity().finish(); // Call once you redirect to another activity
                    }else{
                        Toast.makeText(getActivity().getApplicationContext(),return_val, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        return root;
    }
}
