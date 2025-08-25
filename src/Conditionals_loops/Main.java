package Conditionals_loops;

public class Main {
    public static void main(String[] args) {

//         syntax of if statement
//         if( boolen expression T or F ) {
//          body
//    } else {
//        // do this}

        int salary = 5000;
//        if(  salary > 10000) {
//            System.out.println("Salary is greater than 10000");
//        } else {
//            salary = salary + 10000;
        //}
        // multiple if statement

        if( salary > 10000) {
            salary += 2000;
        } else if (salary > 4000) {
            salary +=1000;
        } else {
            System.out.println(salary);
        }


        System.out.println(salary);
    }
}
