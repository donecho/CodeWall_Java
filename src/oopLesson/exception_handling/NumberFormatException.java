package oopLesson.exception_handling;

public class NumberFormatException {

    public static void main(String[] args) {
        String str = "abc";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}
