package Inheritance;

public class Contract extends Staff{
    int period;
    public void getData()
    {
        super.getData();
        System.out.println("Enter the period of contract of the staff in months");
        period =sc.nextInt();
    }
    public void displayData()
    {
        super.displayData();
        System.out.println("Period of contract :"+period);
    }
}
