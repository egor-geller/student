package com.com;

public class Main {
    public static boolean isDoubleEq(double a, double b, double eps){
        double diff = Math.abs(a - b);
        return diff <= eps;
    }

    public static boolean func(double x1, double y1, double x2, double y2, double x3, double y3){
        return isDoubleEq((x1-x2)*(y2-y3), (y1-y2)*(x2-x3), 0.001);
    }

    public static void main(String[] args){
        boolean result = func(1, 1, 2, 3, 5, 8.9999);
        System.out.println(result);
    }
}
