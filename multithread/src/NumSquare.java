import java.lang.Thread;
import java.util.Random;

public class NumSquare extends Thread {
    Random ran = new Random();
    int n,i=0;
    public void run()
    {
        do
        {
            i++;
            n=ran.nextInt(100);
            System.out.println("The square of "+n+" is "+Math.pow(n,2));
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
