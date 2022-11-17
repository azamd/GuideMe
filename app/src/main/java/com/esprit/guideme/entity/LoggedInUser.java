package com.esprit.guideme.entity;


public class LoggedInUser {
    private User loggedInUserModel;
    private static LoggedInUser instance = null;

    private LoggedInUser(){

    }

    public static LoggedInUser getInstance(){
        if(instance == null){
            instance = new LoggedInUser();
        }
        return instance;
    }
    public static LoggedInUser connect(User user){
        if(instance == null){
            instance = new LoggedInUser();
        }
        instance.loggedInUserModel = user;
        return instance;
    }
    public static LoggedInUser disconnect(){
        if(instance == null){
            instance = new LoggedInUser();
        }
        instance.loggedInUserModel = null;
        return instance;
    }
    public User getLoggedInUser(){
        return loggedInUserModel;
    }
}
