package com.company;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Number to check Even or Add.");

        int number = input.nextInt();
        if (number == 0){
            System.out.println("The Number is ZERO.");
        }
        else if(number%2 == 0){
            System.out.println("The Number "+number+" is Even.");
        }else {
            System.out.println("The Number "+number+" is odd");
        }
    }
}
