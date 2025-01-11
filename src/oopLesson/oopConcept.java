package oopLesson;

public class oopConcept {
    public static void main(String[] args) {
        System.out.println("This is OOP Lesson");

        // For static variable call from original obj
        System.out.println(ObjectAndClass.number);

        // For instance variable call from another obj
        ObjectAndClass obj = new ObjectAndClass();
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}

/**
 * Object--Oriented Programming Language
 * * Object -> It's look like dog,cat,orange,apple
 * * Class -> It's look like group of something. Example (Animals, Fruits, Vegetables)
 * * Inheritance -> If ur parent have a car -> their son also have a car.
 * * Polymorphism -> Same job, different action
 * * Abstraction -> It's show necessary action, hide unnecessary action.
 * * Encapsulation -> Collection of data! if you need some data, you can pull out it! /MVC/MVP/ MVVM => Model
 */