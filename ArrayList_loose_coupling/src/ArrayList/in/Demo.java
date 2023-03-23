package ArrayList.in;

import java.util.*;

public class Demo {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<Employee> al = new ArrayList<Employee>();
        System.out.println("Enter number of employees to be stored");
        n=sc.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0; i<n;i++)
        {
            e[i]=new Employee();
            e[i].getData();
            al.add(e[i]);
        }
        Collections.sort(al);
        System.out.println("Displaying the employee details");
        for(Employee emp:al)
            System.out.println(emp);
    }
}
