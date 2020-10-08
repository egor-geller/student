package com.com;

import java.util.Scanner;

public class Main {
    public static double func(double x){
        if(x <= 3){
            return Math.pow(x,2)-3*x+9;
        }else{
            return 1/(Math.pow(x,3)+6);
        }
    }

    public static void main(String[] args){
        double x;
        Scanner f = new Scanner(System.in);
        x = f.nextDouble();
        System.out.println(func(x));
    }
}
