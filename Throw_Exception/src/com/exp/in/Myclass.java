package com.exp.in;
import javax.swing.plaf.synth.SynthTextAreaUI;
public class Myclass {
    static void sub(int a,int b) throws MyException
    {
        if(a>b)
        {
            System.out.println("The result is"+(a-b));
        }
        else
        {
            throw new MyException(a,b);
        }
    }
}

