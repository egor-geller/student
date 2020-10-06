package com.com;

import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args){
        double x;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        double a = Math.floor(x);
        double b = (x - a) * 1000;
        double res = b + a / 1000;
        System.out.printf("%.3f",res);
    }
}
