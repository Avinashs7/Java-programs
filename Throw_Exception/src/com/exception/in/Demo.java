package com.exception.in;

import java.util.Scanner;

public class Demo {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter name of person to create bank account");
        name=sc.next();
        System.out.println("Enter the person age");
        age=sc.nextInt();
        try
        {
            Account obj = MyClass.createAccount(name,age);
            obj.deposit();
            obj.details();
        }
        catch(MyException e)
        {
            e.printStackTrace();
        }

    }
}
