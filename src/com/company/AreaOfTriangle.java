package com.company;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Base");
        int B = input.nextInt();

        System.out.println("Enter your Height.");
        int H = input.nextInt();

        double A ;

        A = 0.5 * B * H;
        System.out.println("The Area is "+A);
    }
}
