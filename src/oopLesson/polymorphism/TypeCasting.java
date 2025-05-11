package oopLesson.polymorphism;


class Type{
    void sum(){
        System.out.println("Parent sum method is working");
    }

}

public class TypeCasting extends Type {

    void sum(){
        System.out.println("Child sum method is working");
    }

    public static void main(String[] args) {
        int a =5;
        double b = a; //widening casting
        int c = (int) b;// narrowing casting

        Type type = new TypeCasting(); //upcasting
        type.sum();
    // Type type = (Type)TypeCasting //widening //upcasting
        //TypeCasting childObj = (TypeCastig) type;//downcasting

    }
}
