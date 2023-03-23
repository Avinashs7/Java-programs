package com.exception.in;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    double bal;
    public Account(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void deposit()
    {
        System.out.println("Enter amount to be deposited");
        bal=sc.nextDouble();
    }
    public void details()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Balance: "+bal);
    }
}
