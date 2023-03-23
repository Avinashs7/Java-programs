package com.functionarray.avi;

import java.util.ArrayList;

public class Arraylist {
    public ArrayList<Student> getArraylist()
    {
        Student ob1 = new Student(1,"Dilip");
        Student ob2 = new Student (2,"Arjun");
        ArrayList<Student> al =new ArrayList<Student> ();
        al.add(ob1);
        al.add(ob2);
        return al;
    }

}
