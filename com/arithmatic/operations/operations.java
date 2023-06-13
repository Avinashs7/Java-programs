package com.arithmatic.operations;

public class operations {
	public int compute(int num1,int num2,char op)
	{
		switch(op)
		{
		case '+':
			return num1+num2;
		case '-':
			return num1-num2;
		case '*':
			return num1*num2;
		case '/':
			return num1/num2;
		case '%':
			return num1%num2;
		default :
		System.out.println("Invalid option");
		System.exit(0);
		}
		return 0;
	}
	
}
