package com.exception.in;

public class MyException extends Throwable{
    public String toString()
    {
        return "The age is below 18";
    }
}
