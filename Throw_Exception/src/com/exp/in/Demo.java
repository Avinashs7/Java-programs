package com.exp.in;

public class Demo {
        public static void main(String[] args)
        {
            int a=10;
            int b=20;
            try
            {
                Myclass.sub(a,b);
            }
            catch(MyException e)
            {
                e.printStackTrace();
            }
        }
}
