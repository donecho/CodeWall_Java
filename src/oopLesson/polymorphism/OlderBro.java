package oopLesson.polymorphism;

interface WorkFromMom{
    void homework();
}

public class OlderBro implements WorkFromMom{

    public static void main(String[] args) {
        OlderBro obj = new OlderBro();
        obj.homework();
        YoungerBro ybj = new YoungerBro(new OlderBro());
    }

    @Override
    public void homework() {
        System.out.println("Mon'Work");
    }
}
