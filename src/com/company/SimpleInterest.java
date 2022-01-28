package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your P.");
        int p = input.nextInt();

        System.out.println("Enter your R.");
        int R = input.nextInt();

        System.out.println("Enter your T.");
        int T = input.nextInt();

        int A ;

        A = (p*R*T)/100;
        System.out.println("The interest is "+A);



    }
}
