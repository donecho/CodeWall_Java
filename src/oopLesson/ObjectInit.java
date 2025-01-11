package oopLesson;

class Student{
    int id;
    String name;
}

public class ObjectInit {
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println("id is "+ std.id);
        System.out.println("name is "+ std.name);

        std.id = 1;
        std.name = "Zin Phyo Thant";

        Student std1 = new Student();
        std1.id = 2;
        std1.name = "Mg Thant";
    }
}

//attributes => direct
//method =>
//constructor

