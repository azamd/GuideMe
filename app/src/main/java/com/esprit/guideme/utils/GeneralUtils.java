package com.esprit.guideme.utils;

import com.esprit.guideme.entity.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneralUtils {
    public static boolean checkSignUpForm(User u){
        if(GeneralUtils.isEmail(u.getEmail()) && (u.getPassword().length() > 5)
                && (u.getFirstName().length() != 0)){
            return true;
        }
        return false;
    }
    public static boolean isEmail(String email){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
