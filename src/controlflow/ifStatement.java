package controlflow;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        //Controlflow have decision-making statement / loop statement / jump statement

        //decision making -> (if)(if-else)(if-else-if) / switch

        //syntax -> dateType variableName = Value;

        //if statement | if(condition){}

        int a = 10;
        int b = 5;
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }

        int c = 20;
        int d = 30;
        if (d<c){
            System.out.println(d +" is less than "+ c);
        } else {
            System.out.println(d+" is greater than "+ c);
        }

        //For exam under 40 is fail/40 is pass / 60 is merit / 80 is distation
        Scanner Student_mark = new Scanner(System.in);
        System.out.print("Enter Studnet Mark: ");
        int mark = Student_mark.nextInt();
        System.out.println("Student mark is " + mark );

        if (mark < 40){
            System.out.println("This student is exam fail");
        } else if (mark >= 40){
            System.out.println("This student is pass");
        } else if (mark >= 60 ) {
            System.out.println("This student is merit");
        } else if (mark <= 80) {
            System.out.println("This studnet is distation");
        } else {
            System.out.println("Enter Between 0 and 100");
        }

    }
}

