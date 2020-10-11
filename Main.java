package com.com;

import java.util.Scanner;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */

public class Main {
    public static void main(String[] args){
        int n,m;
        Scanner f = new Scanner(System.in);
        m = f.nextInt();
        n = f.nextInt();
        for (int i = m; i <= n; i++){
            for (int j = 2; j <=n; j++){
                if (i%j == 0){
                    if (i != j)
                        System.out.println(j);
                }
                if (j == n)
                    System.out.println();
            }
        }
    }
}
