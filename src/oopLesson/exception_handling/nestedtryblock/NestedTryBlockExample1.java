package oopLesson.exception_handling.nestedtryblock;

public class NestedTryBlockExample1 {

    public static void main(String[] args) {
        int a = 12;
        int b = 0;

        try {

            try{
                int result = a/b;
                System.out.println(result);
            }catch (ArithmeticException e){
                System.out.println("first Exception Handling");
            }

            try{
                int numbers[] = new int[7];
                System.out.println(numbers[9]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("second Exception Handling");
            }

            System.out.println("This is Ok");
        }
        catch (Exception e){
            System.out.println("General Exception");
        }

        System.out.println("This is the end of program");
    }
}
