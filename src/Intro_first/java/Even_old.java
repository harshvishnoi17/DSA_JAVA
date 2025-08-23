package Intro_first.java;

import java.util.Scanner;

public class Even_old {
    public static void main(String[] args) {
        // 1. Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = input.nextInt();
        if( num%2 == 0) {
            System.out.println("number is even " +num);
        } else  {
            System.out.println("number is not even " +num);
        }

    }
}
