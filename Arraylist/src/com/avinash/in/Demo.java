package com.avinash.in;

import java.util.ArrayList;

public class Demo {
    public static void main(String[]args)
    {
        ArrayList<Student> al = new ArrayList<Student>();
        Student ob1 = new Student();
        Student ob2 = new Student();
        Student ob3 = new Student();
        al.add(ob1);
        al.add(ob2);
        al.add(ob3);
        for(Student s: al)
            System.out.println(s);
    }
}
