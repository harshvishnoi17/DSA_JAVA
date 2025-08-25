package Conditionals_loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // find the fibonacci series up to nth
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
