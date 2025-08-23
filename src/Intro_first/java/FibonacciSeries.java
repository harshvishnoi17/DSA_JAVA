package Intro_first.java;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // To calculate Fibonacci Series up to n numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;

        for(int i=0; i<n; i++ ){
            System.out.println(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

    }
}
