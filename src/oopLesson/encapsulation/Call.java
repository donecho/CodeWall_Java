package oopLesson.encapsulation;

public class Call {
    public static void main(String[] args) {
    Model obj = new Model(12);
    obj.setId(1);
    System.out.println(obj.getId());
    obj.setName("Zin");
        System.out.println(obj.getName());
        System.out.println(obj.age);

    }
}
