package oopLesson.polymorphism;


class TestInstance{

}

public class InstanceOfOperator extends TestInstance {

    public static void main(String[] args) {
        InstanceOfOperator obj = new InstanceOfOperator();
        System.out.println(obj instanceof InstanceOfOperator);

        System.out.println(obj instanceof TestInstance);
    }
}
