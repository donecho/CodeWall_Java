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

        //for anonymous object
        //This Student 2 obj is not same.
        System.out.println("For Anonymous Object - "+ new Student().id);
        System.out.println("For Anonymous Object - "+ new Student().name);

        Student student = new Student(),student1 = new Student();
        System.out.println(student.id);
        System.out.println(student1.name);
    }
}

//attributes => direct
//method =>
//constructor

//new keyword
//newInstance() method
//clone()
//deserialization
//factory method

// how to build object -> ClassName objName = new Con();
// new Con() -> anonymous object

