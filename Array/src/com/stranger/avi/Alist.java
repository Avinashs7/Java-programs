package com.stranger.avi;
import java.util.ArrayList;
import java.util.Scanner;
public class Alist {
    Scanner sc = new Scanner(System.in);
    String str;
    public void append(ArrayList al)
    {
        System.out.println("Enter string");
        str = sc.next();
        al.add(str);
        System.out.println("The array elements are :"+al);
    }
    public void insert(ArrayList al)
    {
        System.out.println("Enter string");
        str = sc.next();

    }
}
