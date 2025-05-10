package oopLesson;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Banking {

    int id;
    String name;
    double amount;

    public Banking(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    void add(double amt){
        amount +=amt;
    }

    void draw(double b){
        if (amount<b){
            amount -=b;
        } else
            System.out.println("Not enough");
    }

    public static void main(String[] args) {
        Banking user1 = new Banking(1,"Zin",10000);
        user1.add(5000);
        System.out.println(user1.amount);

        user1.draw(1000);
        System.out.println(user1.amount);
    }
}
