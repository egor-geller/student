package com.com;

import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args){
        int a,b,c;
        double z;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        z = func(a,b,c);
        System.out.println(z);
    }
    public static double func(int a, int b, int c){
        if((b*b-4*a*c) < 0){
            System.out.println("Squre root is < 0");
            return 0;
        }
        return ((b+Math.sqrt(b*b-4*a*c))/2*a - Math.pow(a,3)*c+Math.pow(b,-2));
    }
}
