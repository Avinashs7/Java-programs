package com.avinash.in;
import java.util.Scanner;
public class Student {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    public Student()
    {
        System.out.println("Enter student id\n");
        id = sc.nextInt();
        System.out.println("Enter student name\n");
        name = sc.next();
    }
    public String toString()
    {
        return "Name:"+name+"\nID:"+id+"\n";
    }
}

