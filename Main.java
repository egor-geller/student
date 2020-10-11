package com.com;

import java.util.Scanner;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Main {
    public static void main(String[] args){
        String n,m;
        Scanner f = new Scanner(System.in);
        m = f.nextLine();
        n = f.nextLine();
        for (int i = 0; i < m.length(); i++){
            for (int j = 0; j < n.length(); j++)
            {
                if (m.charAt(i) == n.charAt(j)){
                    System.out.println(m.charAt(i));
                }
            }
        }
    }
}
