public class Demo {
    public static void main(String[]args)
    {
        int a=10,b=20;
        try
        {
            System.out.println("Running the try block");
            a=10/0;
            System.out.println("Exiting try block");
        }
        catch(ClassCastException e)
        {
            //10/0 is an arithmetic exception
            System.out.println("Running catch block");
        }
        finally
        {
            System.out.println("The value of a is : "+a);
            System.out.println("The value of b is : "+b);
        }
    }
}
