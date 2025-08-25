package Conditionals_loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 234567;
        int reverse = 0 ;
        while(num > 0) {
            int rem = num % 10;
            num /= 10;

            reverse = reverse*10 + rem;

        }
        System.out.println(reverse);
    }
}
