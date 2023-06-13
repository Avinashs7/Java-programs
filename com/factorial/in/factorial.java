package com.factorial.in;
import java.util.*;
public class factorial {
	public static long compute(int num)
	{
		if(num==0 || num==1)
			return 1;
		else
			return num*compute(num-1);
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num= sc.nextInt();
		System.out.println("The factorial of "+num+" is "+compute(num));
	}
}
