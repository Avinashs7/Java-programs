package com.exception.in;

public class MyClass extends MyException{
    static Account createAccount(String name,int age)throws MyException
    {
        if(age>18)
            return new Account(name,age);
        else
            throw new MyException();
    }
}
