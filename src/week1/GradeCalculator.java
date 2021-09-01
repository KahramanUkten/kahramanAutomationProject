package week1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args){

        System.out.println("Please enter midterm 1 grade.");
        Scanner scanner = new Scanner(System.in);
        int midtermGrade1 = scanner.nextInt();

        System.out.println("Please enter midterm 2 grade.");
        int midtermGrade2 = scanner.nextInt();

        System.out.println("Please enter final grade.");
        int finalGrade = scanner.nextInt();

        scanner.close();

        Double midtermPart1 = midtermGrade1 * 0.2 ;

        Double midtermPart2 = midtermGrade2 * 0.2 ;

        Double finalPart = finalGrade * 0.6 ;

        Double grade = midtermPart1 + midtermPart2 + finalPart ;

        System.out.println("Your grade is " + grade);



    }
}
