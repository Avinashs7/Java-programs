import java.util.ArrayList;

public class Demo {
    public static void main(String[]args)
    {
        ArrayList al = new ArrayList();
        al.add("Hello");
        al.add(10);
        //al.add(new Integer(21));
        System.out.println("Array list size is: "+al.size());
        //k=System.out.println(al.get(0));
        for(int i=0; i<al.size(); i++)
        {
            System.out.println(al.get(i));
        }
    }
}
