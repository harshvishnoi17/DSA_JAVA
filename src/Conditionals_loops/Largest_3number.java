package Conditionals_loops;

import java.util.Scanner;

public class Largest_3number {
    public static void main(String[] args) {
        // find the largest of the 3 numbers

        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // 10
        int b = input.nextInt(); // 20
        int c = input.nextInt(); // 30
        int max = a;
        if( b > max) {
            max = b;
        } if(c > max) {
            max = c;
        }
        // method 2
      //  int max = Math.max(c,Math.max(a, b )) ;
        System.out.println(max);


    }
}
