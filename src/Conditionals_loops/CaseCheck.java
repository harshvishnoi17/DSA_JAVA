package Conditionals_loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        // alphabet case check
        Scanner input = new Scanner(System.in);
       char ch = input.next().trim().charAt(0);
       if( ch >= 'a' && ch <= 'z') {
           System.out.println("lowercase letter ");
       } else {
           System.out.println("uppercase letter ");
       }

    }
}
