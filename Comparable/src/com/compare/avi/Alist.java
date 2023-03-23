package com.compare.avi;

import java.util.ArrayList;

public class  Alist {
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    ArrayList<Student> al = new ArrayList<Student>();
    public ArrayList<Student> getList() {
        al.add(s1);
        al.add(s2);
        al.add(s3);
        return al;
    }

}
