package Inheritance;

import java.util.Scanner;

public class Staff {
    Scanner sc = new Scanner(System.in);
    String name;
    long ph;
    double sal;
    public void getData()
    {
        System.out.println("Enter name of staff");
        name = sc.nextLine();
        System.out.println("Enter salary of staff");
        sal = sc.nextDouble();
        System.out.println("Enter phone number");
        ph = sc.nextLong();
    }
    public void displayData()
    {
        System.out.println("Name : "+name);
        System.out.println("Salary :"+sal);
        System.out.println("Phone number :"+ph);
    }
}
