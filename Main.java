package com.com;

import java.util.Scanner;

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
        return ((a-3)*b/2)+c;
    }
}
