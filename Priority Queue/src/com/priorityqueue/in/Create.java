package com.priorityqueue.in;
import java.util.*;
public class Create{
    Scanner sc = new Scanner(System.in);
    public Queue <employee> getQueue()
    {
        Queue q = new PriorityQueue();
        System.out.println("Enter number of employees you need to enter");
        int i=sc.nextInt();
        employee e[]=new employee[i];
        for(int j=0; j<i; j++) {
            e[j]=new employee();
            q.add(e[j]);
        }
        return q;
    }

}
