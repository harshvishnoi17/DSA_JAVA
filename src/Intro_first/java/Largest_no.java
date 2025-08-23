package Intro_first.java;

import java.util.Scanner;

public class Largest_no {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the two numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if( num1> num2) {
            System.out.println("The largest number is " + num1) ;
        } else {
            System.out.println("The largest number is " + num2) ;
        }

    }
}
