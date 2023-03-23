package Inheritance;

import java.util.Scanner;

public class Teaching extends Staff{
    Scanner sc = new Scanner(System.in);
    int pub;
    String qual;
    public void getData()
    {
        super.getData();
        System.out.println("Enter qualification of teaching staff");
        qual = sc.nextLine();
        System.out.println("Enter number of publication of staff");
        pub = sc.nextInt();
    }
    public void displayData()
    {
        super.displayData();
        System.out.println("Qualification :"+qual);
        System.out.println("Publications :"+pub);
    }
}
