package com.com;

import java.util.Scanner;

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е.
 */

public class Main {
    public static double func(int n) {
       return (1/(Math.pow(2,n)))+(1/(Math.pow(3,n)));
    }
    public static void funcA(int e, int n){
        for (int i = n; i >= -100; i--)
        {
            if (func(i) >= e)
            {
                System.out.println(func(i));
            }
        }
    }

    public static void main(String[] args){
        int n, e;
        Scanner f = new Scanner(System.in);
        n = f.nextInt();
        e = f.nextInt();
        funcA(e, n);
    }
}
