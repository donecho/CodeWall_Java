package oopLesson.string;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {

        String str = " Hello World ";
        System.out.println(str.toUpperCase() );
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.trim().length());

        String sname ="ZPT";
        System.out.println(sname.charAt(2));
        System.out.println(sname.indexOf("P"));

        System.out.print("Enter your Name: ");
        String name = new Scanner(System.in).nextLine();



        if(name.startsWith("Mg")){
            System.out.println("Hello Mg "+ name);
        }else if(name.startsWith("Ma")){
            System.out.println("Hello Ma "+name );
        }else {
            System.out.println("Please enter your name with specifieed format: ");
        }



    }
}
