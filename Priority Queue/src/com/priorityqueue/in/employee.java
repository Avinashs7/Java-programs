package com.priorityqueue.in;

import java.util.Scanner;
import java.io.*;
public class employee implements Comparable<employee> {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    public employee()
    {
        System.out.println("Enter employee name");
        name=sc.nextLine();
        System.out.println("Enter employee ID");
        id=sc.nextInt();
    }
    public int compareTo(employee ob) {
        if (this.id > ob.id)
            return 1;
        else if (this.id < ob.id)
            return -1;
        else
            return 0;
    }
    public String toString()
    {
        return "Name: "+name+"" +"\nID: "+id;
    }
}
