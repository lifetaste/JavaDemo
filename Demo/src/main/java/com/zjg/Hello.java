package com.zjg;

/**
 * Created by jgongzh on 2018/11/29.
 */
public class Hello {
    public static void main(String[] args){
        long sum=0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }
}
