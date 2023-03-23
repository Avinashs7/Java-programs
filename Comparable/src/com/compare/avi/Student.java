
package com.compare.avi;
import java.util.*;
public class Student implements  Comparable<Student>{
    Scanner sc = new Scanner(System.in);
    int rank;
    String name;
    public Student()
    {
        System.out.println("Enter rank");
        rank=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
    }
    public int compareTo(Student S2)
    {
        if(rank>S2.rank)
            return 1;
        else
            return -1;
    }
    public String toString()
    {
        return "Student name:"+name+"Rank:"+rank;
    }
}
