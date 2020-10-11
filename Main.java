package com.com;

import java.util.Scanner;

/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
 */

public class Main {
    public static void main(String[] args){
        String num;
        int nus;
        Scanner f = new Scanner(System.in);
        num = f.nextLine();
        for (int i = 0; i < num.length(); i++){
            nus = num.charAt(i);
            System.out.println(nus);
        }
    }
}
