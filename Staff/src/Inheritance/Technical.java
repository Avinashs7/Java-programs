package Inheritance;

public class Technical extends Staff {
    String skill;
    public void getData()
    {
        super.getData();
        System.out.println("Enter the skills of technical staff");
        skill = sc.nextLine();
    }
    public void displayData()
    {
        super.displayData();
        System.out.println("Skills :"+skill);
    }
}
