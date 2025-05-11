package oopLesson.encapsulation;

class Model{
    private int id;
    private String name;
    int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Model(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ModelFromGetSet {

    public static void main(String[] args) {

    }
}
