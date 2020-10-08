package com.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String x = new String("123456");
        Scanner in = new Scanner(System.in);
        System.out.println(x.substring(0,2) + "H" + x.substring(2,4) + "M" + x.substring(4,6) + "S");
    }
}
