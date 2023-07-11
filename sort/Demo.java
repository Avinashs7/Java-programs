package com.quick.sort;

import java.util.Random;
import java.util.Scanner;
import com.selection.sort.selection;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		Scanner sc = new Scanner(System.in);
		QuickSort ob = new QuickSort();
		selection obj = new selection();
			System.out.println("Enter the size");
			int n=sc.nextInt();
			int arr[]=new int[n+1];
			for(int i=0;i<n; i++)
				arr[i]=r.nextInt(0,5000);
			arr[n]=Integer.MAX_VALUE;
			int op;
			long start,stop;
			while(true){
				System.out.println("Enter the option");
				op=sc.nextInt();
			switch(op)
			{
			case 1:
				ob.sort(arr,0,n);
				start=System.nanoTime();
				ob.sort(arr,0,n);
				stop=System.nanoTime();
				System.out.println("*****\nBest case:"+(stop-start)+"\n******");
				break;
			case 2:
//				for(int i=0; i<n; i++)
//					System.out.print(arr[i]+" ");
				start=System.nanoTime();
				ob.sort(arr,0,n);
				stop=System.nanoTime();
				System.out.println("*****\nAverage case:"+(stop-start)+"\n******");
//				for(int i=0; i<n; i++)
//					System.out.print(arr[i]+" ");
//				System.out.println(" ");
				break;
			case 3:
				obj.dsort(arr,n);
				start=System.nanoTime();
				ob.sort(arr,0,n);
				stop=System.nanoTime();
				System.out.println("*****\nWorst case:"+(stop-start)+"\n******");
				break;
			default:
				System.exit(0);
			}
			}
	}

}
