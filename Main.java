package com.com;

import java.util.Scanner;

/*
напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Main {
    public static double func(double x){
        double a = 0;
        for (int i = 1; i <= x; i++)
        {
            a+=i;
        }
        return a;
    }

    public static void main(String[] args){
        double x;
        Scanner f = new Scanner(System.in);
        x = f.nextDouble();
        System.out.println(func(x));
    }
}
