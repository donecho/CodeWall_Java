package oopLesson.exception_handling;

public class NullPointerException {
    public static void main(String[] args) {
        String str = null;


        try {
            int count = str.length();
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println(str="Zin");
        }

        System.out.println("The end of this program");

    }
}
