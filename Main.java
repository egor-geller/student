package com.com;

import java.util.Scanner;

public class Main {
    public static boolean func(double a, double b, double x, double y){
        return (x <= a)&&(y<=b);
    }

    public static void main(String[] args){
        double a,b,x,y,z;
        Scanner f = new Scanner(System.in);
        a = f.nextDouble();
        b = f.nextDouble();
        x = f.nextDouble();
        y = f.nextDouble();
        z = f.nextDouble();
        boolean result = func(a,b,x,y) || func(a,b, y,x) ||
                func(a,b,x,z) || func(a,b,z,x) ||
                func(a,b,y,z) || func(a,b,z,y);
        System.out.println(result);
    }
}
