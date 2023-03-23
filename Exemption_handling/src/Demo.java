import java.util.Scanner;

public class Demo {
    public static void main(String[]args)
    {
        int c;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try
        {
            c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Catch block");
            e.printStackTrace();
        }
    }
}
