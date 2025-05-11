package oopLesson.exception_handling.nestedtryblock;

public class NestedTryBlockExample2 {
    public static void main(String[] args) {
        int a =45;
        int b = 0;

    try {
        try {
            try {
                int result = a/b;
                System.out.println(result);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("First Handling");
            }
        }catch (NullPointerException e){
            System.out.println("Second Handling");
        }
    }catch (Exception e){
        System.out.println("General Handling");
    }

    }
}
