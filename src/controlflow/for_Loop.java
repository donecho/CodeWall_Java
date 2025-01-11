package controlflow;

import java.util.Scanner;

public class for_Loop {
    public static void main(String[] args){
//        For Loop | for(initialize;condition;count){}
        for(int i=10;i<=100;i+=10){
            System.out.print(i+"\t");
        }
        System.out.println();


        Scanner month = new Scanner(System.in);
        System.out.print("Enter Month: ");
        String months = month.nextLine();

//        switch(month){
//            case "January": System.out.println("January is 30");break;
//            case "June": System.out.println("June is 30");break;
//            case "November": System.out.println("November is 30");break;
//            default: System.out.println("February is 29");
//        }

        switch(months){
            case "30": System.out.println("January,April,June,November is 30");break;
            case "31": System.out.println("Another months are 31");break;
            default: System.out.println("February is 29");
        }







    }
}
