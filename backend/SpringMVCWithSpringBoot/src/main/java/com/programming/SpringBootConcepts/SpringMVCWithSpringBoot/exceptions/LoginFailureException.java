package com.programming.SpringBootConcepts.SpringMVCWithSpringBoot.exceptions;

public class LoginFailureException extends Exception{
    public LoginFailureException(String message){
        super(message);
    }
}
