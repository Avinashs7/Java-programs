package com.stranger.in;

public class Demo {
    public static void main(String[]args)
    {
        System.out.println("The main starts");
        int a=10;
        int b=20;
        try
        {
            System.out.println("Running try block");
            a=Integer.parseInt("120");
            System.out.println(a);
            System.out.println("Exiting try block");
        }
        catch(ArithmeticException e)
        {
            System.out.println("1st catch block");
            e.printStackTrace();
        }
        catch(ClassCastException e)
        {
            System.out.println("2nd catch block");
            e.printStackTrace();
        }
        catch(Throwable e)
        {
            System.out.println("3rd catch block");
            System.out.println(e.getMessage());
            System.out.println(a);
            System.out.println(b);
        }
    }
}
