package create.array.student;
import java.util.*;
public class Demo {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter number of student's details to be stored");
        n=sc.nextInt();
        Student obj[]=new Student[n];
        for(i=0; i<n; i++)
            obj[i]= new Student();
        for(i=0; i<n; i++)
            obj[i].getData();
        for( i=0; i<n; i++)
        {
            obj[i].displayData();
            System.out.println(" ");
        }
    }
}
