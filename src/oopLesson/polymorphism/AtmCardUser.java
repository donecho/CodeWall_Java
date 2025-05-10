package oopLesson.polymorphism;

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class AtmCardUser extends Person{
    double amount;

    public AtmCardUser(int id, String name, double amount) {
        super(id, name);
        this.amount = amount;
    }

    void show(){
        System.out.print("id - " +id+"\t");
        System.out.print("name - " + name+"\t");
        System.out.print("amount - "+amount+"\t");
    }


    public static void main(String[] args) {
        AtmCardUser user1 =  new AtmCardUser(1,"Zin",100000);
        user1.show();
        AtmCardUser user2 =  new AtmCardUser(2,"Phyo",200000);
        user2.show();

    }
}
