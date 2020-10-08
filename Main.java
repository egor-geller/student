package com.com;

public class Main {
    public static void func(int x, int y){
        if ((x+y) <= 180) {
            System.out.println("Can be trinagle");
            if (180 - x - y == 90){
                System.out.println("Its a 90 degree");
            }
        }else{
            System.out.println("Cannot be trinagle");
        }
    }

    public static void main(String[] args){
        func(30,610);
    }
}
