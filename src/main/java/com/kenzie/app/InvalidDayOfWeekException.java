package com.kenzie.app;

public class InvalidDayOfWeekException extends IllegalArgumentException{
    //create constructors
    public InvalidDayOfWeekException (String message){
        super(message);
    }
    public InvalidDayOfWeekException (String message, Throwable cause){
        super(message, cause);
    }
}
