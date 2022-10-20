package org.example.exception;

public class ObjectNotFoundException extends Exception{
    public ObjectNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
