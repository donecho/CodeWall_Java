package oopLesson.polymorphism;

public class WrapperClassExample {
    public static void main(String[] args) {
        int a = 67;
        String message = "hello";
        Integer integer = a;
        System.out.println(integer.getClass());
        String str = integer.toString();
        System.out.println(str.length());


        Float float1 = 5.7f;
        String num = "094444";
        Integer num1 = Integer.valueOf(String.valueOf(float1));
        Integer num2 = Integer.parseInt(num);
        System.out.println(num1);


    }
}

//primitive data type => object -> autoboxing
//obj => p d t => unboxing
