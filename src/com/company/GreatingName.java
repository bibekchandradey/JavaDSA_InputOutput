package com.company;

import java.util.Scanner;

public class GreatingName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name.");

        String name = input.next();

        System.out.println("Welcome "+name);

    }
}
