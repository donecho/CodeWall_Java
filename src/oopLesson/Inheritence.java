package oopLesson;

class Parent{
    String father = "U Ba";
    String mother = "Day Mya";

    void hometown(){
        System.out.println("Yangon");
    }

    void marrige(){
        System.out.println("They have marrige");
    }
}

class Children extends Parent{
    String son ="Mg Mya";
    String daughter = "Mg Ba";
    void age(){
        System.out.println("They are same age");
    }

}

public class Inheritence {

    public static void main(String[] args) {
        Parent prt = new Parent();
        System.out.println(prt.father);
        System.out.println(prt.mother);
        prt.hometown();

        Children chld = new Children();
        System.out.println(chld.son);
        System.out.println(chld.daughter);
        chld.marrige();

    }
}
