package oopLesson.polymorphism;


class Parent7{
    void add(){
        System.out.println("Parent add method");
    }

}

public class DifferentBetween extends Parent7{

    @Override
    void add() {
        System.out.println("Child Method ");
    }

    static void sum(double a){
        System.out.println(a+a);
    }

    static void sum(int a){
        System.out.println(a+a);
    }

    static void sum (int a, int b){
        System.out.println(a+b);
    }



    public static void main(String[] args) {
        sum(6.7);

        DifferentBetween obj = new DifferentBetween();
        obj.add();


    }
}
