package com.arithmatic.operations;
import java.util.*;
public class demo {
	public static void main(String[]args)
	{
		char op;
		int num1,num2;
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter opertor to perform on operands");
			op = sc.next().charAt(0);
			System.out.println("Enter two numbers");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			operations ob = new operations();
			System.out.println("The result : "+ob.compute(num1,num2,op));
		}
		
	}
}
