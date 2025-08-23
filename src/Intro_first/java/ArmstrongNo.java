package Intro_first.java;
import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int count = 0;
        int sum = 0;

        // Count number of digits
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = num;
        // Calculate sum of digits raised to the power of count
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        // Check if sum equals original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
