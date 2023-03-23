package Inheritance;

import java.util.Scanner;

public class Demo {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int t,te,c,i;
        System.out.println("Enter number of teaching staff");
        t=sc.nextInt();
        Teaching ob[]=new Teaching[t];
        for(i=0; i<t; i++)
        {
            ob[i]=new Teaching();
            ob[i].getData();
        }
        System.out.println("Enter number of technical staff");
        te = sc.nextInt();
        Technical obj[]=new Technical[te];
        for(i=0; i<te; i++)
        {
            obj[i]=new Technical();
            obj[i].getData();
        }
        System.out.println("Enter number of Contract staff");
        c = sc.nextInt();
        Contract obje[]=new Contract[c];
        for(i=0; i<c; i++)
        {
            obje[i]=new Contract();
            obje[i].getData();
        }
        System.out.println("Displaying Teaching Staff details");
        for(i=0; i<t; i++)
            ob[i].displayData();
        for(i=0; i<te; i++)
            obj[i].displayData();
        for(i=0; i<c; i++)
            obje[i].displayData();
    }
}
