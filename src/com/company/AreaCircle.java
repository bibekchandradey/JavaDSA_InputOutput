package com.company;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your R.");
        int R = input.nextInt();

        double A ;

        A = 2 * 3.1416* R;
        System.out.println("The Area is "+A);
    }
}
