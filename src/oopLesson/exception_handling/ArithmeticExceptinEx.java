package oopLesson.exception_handling;

public class ArithmeticExceptinEx {
    public static void main(String[] args) {
        System.out.println("The beginning of this program");
        int a = 23;
        int b = 0;

        try {
            int result =a/b;
            System.out.println(result);
        }catch (ArithmeticException exception){
            System.out.println(exception);
            int result1 = a/(b+3);
            System.out.println(result1);
            //System.out.println(exception.getMessage());
            //custom message gor this exception
        }

        System.out.println("The end if this program");
    }
}


//try
//catch
//finally