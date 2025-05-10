package oopLesson.polymorphism;



class Parent{
    Parent(){
        System.out.println("Parent constructor is working");
    }
    {
        System.out.println("Initializer block");
    }
}

class Parent2 extends Parent{
    Parent2(){
        super();
        System.out.println("P2 default constructor");
    }

    Parent2(int a){
        System.out.println("Parent2's one parameter is working");
    }
    {
        System.out.println("Initializer block");
    }
}

public class InitializerBlockExample {
    //instance data member / fields
    InitializerBlockExample() {
        super();
        System.out.println("Constructor");
    }

    {
        System.out.println("Initializer block");
    }

    public static void main(String[] args) {
        new Parent2(5);
        new Parent2();
    }
}
