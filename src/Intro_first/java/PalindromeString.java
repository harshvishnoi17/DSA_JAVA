package Intro_first.java;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        // To find out whether the given String is Palindrome or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        String lowerStr = str.toLowerCase();
        String str1 = str.toLowerCase();
        String reverseStr = new StringBuffer(str1).reverse().toString();

        if(lowerStr.equals(reverseStr)){
            System.out.println(str + " the string is a palindrome ");
        } else {
            System.out.println(str + " " + "the string is not a palindrome");

        }

    }
}
