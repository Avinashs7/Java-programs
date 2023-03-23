package com.priorityqueue.in;
import java.util.*;
public class Demo {
    public static void main(String[]args) {
        Create obj = new Create();
        Queue qu = obj.getQueue();

        System.out.println(qu.size());
        while(!qu.isEmpty())
            System.out.println(qu.poll());
    }
}
