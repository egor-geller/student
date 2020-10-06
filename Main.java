package com.com;

import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args){
        double z, x, y;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();
        z = func(x,y);
        System.out.println(z);
    }
    public static double func(double x, double y){
        return (((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y));
    }
}
