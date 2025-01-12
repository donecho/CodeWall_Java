package oopLesson;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

//        System.out.print("Enter a number: ");

        System.out.print("Enter a message: ");

        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
        String message = scanner.nextLine();
//
//        if(userInput % 2 == 0){
//            System.out.println("Your number is even");
//        }else {
//            System.out.println("Your numnber is odd");
//        }

//        System.out.println(message.length());

        if(message == "password"){
            System.out.println(message=="password");
            System.out.println("password");
        }else {
            System.out.println(message=="password");
            System.out.println(message);
        }



    }

}
