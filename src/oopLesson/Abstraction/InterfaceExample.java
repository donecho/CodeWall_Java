package oopLesson.Abstraction;


import oopLesson.polymorphism.InitializerBlockExample;

interface Callable{
    int a = 78; //=> constant
    void sum1();  //abstract method
    void sum2();
    void sum3();
    void sum4();
}

interface B{
    void cal();
}

public class InterfaceExample implements Callable,B {

    @Override
    public void sum1() {
        System.out.println("Sum 1 is working");
    }

    @Override
    public void sum2() {

    }

    @Override
    public void sum3() {

    }

    @Override
    public void sum4() {

    }

    @Override
    public void cal() {
        System.out.println("Cal is wokring");
    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.sum1();
        obj.cal();
    }
}
