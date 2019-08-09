package com.stackroute.userservice.exceptions;

public class UserAlreadyExistsExeption extends Exception {

    private  String message;
    public  UserAlreadyExistsExeption(){}

    public UserAlreadyExistsExeption(String message){

        super(message);
        this.message=message;
    }

}
