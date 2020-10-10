package com.com;

import java.util.Scanner;

/*
составить программу нахождения произведения квадратов первых 200 чисел
 */

public class Main {
    public static double func(int x) {
       return Math.pow(x,2);
    }
    public static void funcA(int a){
        int sum = 1;
        for (int i = a; i <= a+200; i++)
        {
            sum *= func(i);
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        int a;
        Scanner f = new Scanner(System.in);
        a = f.nextInt();
        funcA(a);
    }
}
