package week1;

import java.util.Scanner;

public class ForStatement2 {
    public static void main(String[] args) {

        int reverseNumber = 0;

        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = number1;
        for (; number1 != 0; number1 /= 10){
            int reverse = number1 % 10;
            reverseNumber = reverseNumber * 10 + reverse;
        }
        System.out.println("Your number         = " + number2);
        System.out.println("Your number reverse = " + reverseNumber);
    }
}
