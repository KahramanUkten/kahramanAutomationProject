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
    }
}
