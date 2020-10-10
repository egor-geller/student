package com.com;

import java.util.Scanner;

/*
вычислить значение функции на отрезке [a.b] с шагом h
 */

public class Main {
    public static double func(int x) {
        if (x>2){
            return x;
        }else{
            return -x;
        }
    }
    public static void funcA(int a, int b, int h){
        for (int i = a; i <= b; i= i + h)
        {
            System.out.println(func(i));
        }
    }

    public static void main(String[] args){
        int a,b,h;
        Scanner f = new Scanner(System.in);
        a = f.nextInt();
        b = f.nextInt();
        h = f.nextInt();
        funcA(a,b,h);
    }
}
