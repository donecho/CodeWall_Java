package oopLesson;

// In class, field -> variable
public class ObjectAndClass {

    static int number = 54; //global variable with static var
    int num1 = 1; //instance variable
    int num2 = 2;
    int num3 = 3;


    public static void main(String[] args) {
        int a = 45; //local variable

        //For object - > ClassName objName = new Constructor();
        ObjectAndClass object1 = new ObjectAndClass();
        System.out.println(object1.num2);
    }
}

//State => apple /color =red /weight = 100g
//behavior

//car => wheel(state)/ windows = (state)
//method / function =>\behavior => drive

// Class - > Filed and Method
// Local variable -
// Global variable -
// static   -> It can call from original class
// instance - > It's appear from class and it can call from other class.