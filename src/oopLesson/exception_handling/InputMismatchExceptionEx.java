package oopLesson.exception_handling;

import java.util.Scanner;

public class InputMismatchExceptionEx {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int userInput = new Scanner(System.in).nextInt();
        System.out.println(userInput);

        System.out.println("The next Operation");
    }
}
