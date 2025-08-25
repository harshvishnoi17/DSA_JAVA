import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

//        //typecasting
//        int num1 = (int)(67.55f);
//        System.out.println(num1);

        //automatic type promation in expressions
        int a = 257;
        byte b = (byte)(a); //257%256 = 1
        System.out.println(b);

        int hh = 1;
        if( hh == 10) {
            System.out.println("hello worl  ");
        } else {
            System.out.println("bholu");
        }



        // while loop
        int count = 1;
        while(count != 6) {
            System.out.println(count);
            count++;
        }

        //for loop

    }
}
