package oopLesson.polymorphism;

public class polymorphm {
    static void calculate(int num1, int num2){
        System.out.println(num1*num2);
    }

    static  void calculate(double num1,double num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        calculate(2,2);
        calculate(3.0,4.1);
    }
}

//type promotion
//type abiguity