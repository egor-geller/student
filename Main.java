package com.com;

public class Main {
    public static boolean func(double x, double y){
        return ((x >= -4) && (y >= -3) && (x <= 4) && (y <= 0)) ||
                ((x >= -2) && (y >= 0) && (x <= 2) && (y <= 4));
    }

    public static void main(String[] args){
        boolean point;
        point = func(1,2);
        System.out.println(point);
    }
}
