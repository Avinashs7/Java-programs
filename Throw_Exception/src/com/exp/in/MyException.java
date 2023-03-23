package com.exp.in;

public class MyException extends Throwable{
    int a,b;
    MyException(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public String toString()
    {
        return "the value of b"+b+"is greater than"+a;
    }
}


