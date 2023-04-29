package com.levitea.backend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(long id){
        super("could not found id sir ji: "+id);
    }
}
