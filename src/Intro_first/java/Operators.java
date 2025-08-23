package Intro_first.java;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
      //  Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("please enter a operator  (+, -, *, /) ");
        char operator = sc.next().charAt(0);

        if(operator == '+') {
            System.out.println("The sum of the two numbers are : " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("The subtractions of the two numbers are : " + (num1 - num2));
        } else if(operator == '*') {
            System.out.println("The multiplication of the two numbers are : " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println("The Division of the two numbers are : " + (num1 / num2));
        } else {
            System.out.println("Invalid input");
        }

    }
}
