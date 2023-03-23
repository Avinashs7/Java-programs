import java.lang.Thread;
import java.util.Random;

public class NumCube extends Thread {
    Random ran = new Random();
    int n,i=0;
    public void run()
    {
        do
        {
            i++;
            n=ran.nextInt(100);
            System.out.println("The cube of "+n+" is "+Math.pow(n,3));
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException  e)
            {
                e.printStackTrace();
            }
        }while(i<10);
    }
}
