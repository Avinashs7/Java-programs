package create.array.student;
import java.util.*;
public class Student {
    Scanner sc=new Scanner(System.in);
    String usn,branch,name;
    long ph;
    public void getData()
    {
        System.out.println("Enter name of student ");
        name = sc.nextLine();
        System.out.println("Enter usn of student");
        usn = sc.nextLine();
        System.out.println("Enter branch of student");
        branch = sc.nextLine();
        System.out.println("Enter phone number");
        ph = sc.nextLong();

    }
    public void displayData()
    {
        System.out.println("Name : "+name);
        System.out.println("Branch :"+branch);
        System.out.println("Phone number :"+ph);
        System.out.println("USN :"+usn);
    }
}
