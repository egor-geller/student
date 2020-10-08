package com.com;

public class Main {
    public static int func(int a, int b, int c, int d){
        return Math.max(Math.min(a,b), Math.min(c,d));
    }

    public static void main(String[] args){
        int max;
        max = func(30,610, 155, 1000);
        System.out.println(max);
    }
}
