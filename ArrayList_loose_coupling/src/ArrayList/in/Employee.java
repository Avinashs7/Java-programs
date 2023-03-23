package ArrayList.in;
import java.util.Scanner;

public class Employee implements Comparable<Employee>{
    Scanner sc = new Scanner(System.in);
    int exp;
    String name;
    double sal;
    public void getData()
    {
        System.out.println("Enter name of employee");
        name = sc.nextLine();
        System.out.println("Enter experience of employee");
        exp = sc.nextInt();
        System.out.println("Enter salary of employee");
        sal = sc.nextDouble();
    }
    public String toString()
    {
        return ("Employee name :"+name+"\nEmployee experience :"+exp+"\nEmployee Salary :"+sal+"\n");
    }
    public int compareTo(Employee obj)
    {
        if(exp > obj.exp)
            return -1;
        else if(exp == obj.exp)
            return 0;
        else
            return 1;
    }
}
