package week1;

import java.util.Scanner;

public class ForStatement {

    public static void main(String[] args) {

        long result = 1;
        System.out.println("Please enter a number 1");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Please enter a number 2");
        int number2 = scanner.nextInt();
        for (;number2 !=0; --number2){
            result *= number1;
        }
        System.out.println("Result = " + result);
    }
}
