package week1;

import java.util.Scanner;

public class ifStatement {

    public static void main(String[] args){
        System.out.println("please enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0){
            System.out.println("your number is negative!!!");
        }
        else{
            System.out.println("your number is not negative!!!");
        }
    }
}
