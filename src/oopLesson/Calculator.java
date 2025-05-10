package oopLesson;

import java.util.Scanner;

public class Calculator {

    static void sum(int num1,int num2){
        System.out.println("Result: "+ num1+num2);
    }

    static void subtraction(int num1,int num2){
        System.out.println("Result:"+ (num1-num2));
    }

    void multiplication(int num1,int num2){
        System.out.println("Result: "+ (num1*num2));
    }

    void division(int num1,int num2){
        System.out.println("Result: "+ (num1/num2));
    }

    public static void main(String[] args) {

        System.out.print("Choose one operator: \n"+
                "1 for sum\n" +
                "2 for subtract\n" +
                "3 for multiply\n" +
                "4 for division\n " +
                "Enter if you want to choose:");
        int operator = new Scanner(System.in).nextInt();


        System.out.print("Enter First Number:");
        int num1 = new Scanner(System.in).nextInt();

        System.out.print("Enter Second Number:");
        int num2 = new Scanner(System.in).nextInt();

        Calculator cal = new Calculator();

        if (operator == 1){
            sum(num1,num2);
        } else if (operator == 2) {
            subtraction(num1,num2);
        } else if (operator == 3){
            cal.multiplication(num1,num2);
        } else if (operator == 4) {
            cal.division(num1,num2);
        } else System.out.println("Something is wrong");


    }
}
