package oopLesson.polymorphism;


class Over{

    Over(String zin){
        System.out.println("Parent's constructor is working");
    }
    Over(String name,int num){
        System.out.println(name);
    }
}
public class MethodOver extends Over{

    MethodOver(String name){
        super("Zin");
        System.out.println(name);
    }


    public static void main(String[] args) {
        MethodOver obj = new MethodOver("Zin Phyo Thant");
    }
}
