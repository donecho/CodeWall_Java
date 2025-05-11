package oopLesson.exception_handling;

public class ArrayindexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7};
        number[8] = 23;
        System.out.println(number[8]);
    }
}
