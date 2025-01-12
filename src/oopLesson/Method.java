package oopLesson;

public class Method { //class file

    //Static method
    static void eat(){
        System.out.println("Eat method is marking");
    }

    //instance method
    void add(){
        int a = 45;
        int b = 40;
        System.out.println(a + b);
    }

    //instance method
    void odd(int c,int d){
        System.out.println(c-d);
    }

    //about return
    void sum(int num1,int num2){
        System.out.println(num1 + num2);
    }

    //about return
    static void name(String firstName,String lastName){
        System.out.println("First name is " + firstName);
        System.out.println("Last name is " + lastName);
    }

    //about return
    int multiple(int num1,int num2){
        System.out.println("Multiple method is working "+(num1*num2));
        return 0;
    }

    //about return
    String msg(){
        return "Hello Text";
    }

    public static void main(String[] args) {// main method

        //For static method
        eat();
        System.out.println("Hello World");

        //for instance method call
        Method method = new Method();
        method.add();
        method.odd(2,1);

        //return type => if you don't want to return use this keyword "void"


        //return type => if you want return use static
        name("Zin","Phyo");

        Method object = new Method();
        object.sum(4,5);
        String str =object.msg();
        int multi = object.multiple(1,5);

        System.out.println(str);
        System.out.println(multi);


    }
}

//method is action/function
//Syntax
//access modifier {non-access modifier {return type { methodName(parameter) => method header}}}
//{ implementation } => method body

//create method -> returnType methodName(){}
//instance method
//static method

//Pre-defined method -> using jdk
//User-defined method => instance and static method

//create => parameter => variable
//use => arguments =? value

//void pr yin ta chr var hte htr los ma ya
//Why use method? For reusable


