package oopLesson;

public class MethodInitialize {

    int id;
    String name;

    void insert(int i,String n){
        this.id = i;
        this.name =n;
    }

    public static void main(String[] args) {

        MethodInitialize card = new MethodInitialize();
        card.insert(21,"Zin");

        System.out.println(card.id);
        System.out.println(card.name);

    }

}

//this -> indicate for instance
