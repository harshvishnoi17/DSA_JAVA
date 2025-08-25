package Conditionals_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from the user until user will enter the X or x
int ans  = 0;
        while(true){
            //take the operators as input
            System.out.println("enter the operators ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input two numbers
                System.out.println("enter two numbers ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println();

                if(op == '+') {
                    ans =  num1 + num2;
                }
                if(op == '-') {
                    ans =  num1 - num2;
                }
                if(op == '*') {
                    ans =  num1 * num2;
                }
                if(op == '/') {
                    if(num2 != 0){
                    ans =  num1 / num2;
                }}
                if(op == '%') {
                    ans =  num1 % num2;
                }

            } else if (op == 'X' || op == 'x') {
                 break;
            } else {
                System.out.println("Invalid input");
            }
            System.out.println(ans);
        }
    }
}
