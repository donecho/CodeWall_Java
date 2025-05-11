package oopLesson.polymorphism;

class Custom{
    private int num;
    Custom(int num){
        this.num = num;
    }

}

public class CusWrap {
    public static void main(String[] args) {
        Custom obj = new Custom(7);
        System.out.println(new Custom(8).getClass().getName());

    }
}
