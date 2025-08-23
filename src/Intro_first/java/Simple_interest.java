package Intro_first.java;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of the P R T");
        float P =  input.nextFloat();
        float R = input.nextFloat();
        float T = input.nextFloat();
        Float SI = (P * R * T/100);
        System.out.println("The simple interest is " + SI);

    }
}
