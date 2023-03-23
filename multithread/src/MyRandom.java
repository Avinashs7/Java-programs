import java.lang.Thread;
import java.util.Random;

public class MyRandom extends Thread{
    Random ran=new Random();
    public void run()
    {
        int i=0,m=0;
        do
        {
            i++;
            m=ran.nextInt(100);
            System.out.println("m= " +m);
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
