package oopLesson.polymorphism;


class SuperParent{
    String name = "Mg Mg";
}
public class SuperKeyWord extends SuperParent {

    String name = "Mya Mya";
    void show(){
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        SuperKeyWord obj = new SuperKeyWord();
        System.out.println(obj.name);
        obj.show();
    }
}
