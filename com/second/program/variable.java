package com.second.program;
import java.util.*;
public class variable {
	int a;
	Scanner sc =new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter a number");
		a= sc.nextInt();
	}
	public void display()
	{
		System.out.println("The number you have entere is "+a);
	}
}
