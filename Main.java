package com.com;

import java.util.Scanner;

/*
найти сумму квадратов первых чисел
 */

public class Main {
    public static double func(int x) {
       return Math.pow(x,2);
    }
    public static void funcA(int a){
        for (int i = a; i <= a+100; i++)
        {
            System.out.println(func(i));
        }
    }

    public static void main(String[] args){
        int a;
        Scanner f = new Scanner(System.in);
        a = f.nextInt();
        funcA(a);
    }
}
