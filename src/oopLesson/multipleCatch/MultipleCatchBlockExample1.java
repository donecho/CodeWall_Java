package oopLesson.multipleCatch;

public class MultipleCatchBlockExample1 {
    public static void main(String[] args) {

        int a = 12;
        int b = 9;

        try {
            int result = a/b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("general exception");
        }
        System.out.println("This is the end of this program");


    }
}
