package oopLesson.Abstraction;

abstract class Parent1{
    Parent1(){};
    void add(){};
    static int calculate(){
        return 1;
    }
}

abstract class Parent2{
    abstract void sum();
    abstract void sum(int a);
}

public class AbstractionEx extends Parent2{

    @Override
    void sum() {
        System.out.println("Parent2 is working");
    }

    @Override
    void sum(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        AbstractionEx obj = new AbstractionEx();
        obj.sum();
        obj.sum(5);
    }
}

//abstract method
//abstract class
