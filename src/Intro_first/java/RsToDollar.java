package Intro_first.java;

import java.util.Scanner;

public class RsToDollar {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency in ruppes");
        float  Rs = input.nextFloat();

        double dollar = (Rs/87.51);
        System.out.println("here is the Currency in dollar " + dollar);
    }
}
