package Intro_first.java;

import java.util.Scanner;

public class Greet_msg {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String str = input.nextLine();
        System.out.println("hello " + str + " how are you doing ?");
    }
}
