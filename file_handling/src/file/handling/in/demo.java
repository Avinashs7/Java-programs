package file.handling.in;

import java.io.File;
import java.util.Scanner;

public class demo {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter filename");
        String filename= sc.nextLine();
        File f = new File(filename);
        if(f.exists())
            System.out.println("The file exists");
        else
            System.out.println("The file doesn't exists");
        if(f.exists())
        {
            if(f.canRead())
                System.out.println("File is readable");
            else
                System.out.println("File is not readable");
            if(f.canWrite())
                System.out.println("File is writable");
            else
                System.out.println("File is not writable");
            System.out.println("File length is "+f.length());
        }
    }
}
