package oopLesson;

public class AggregationEx {

    String name;
    int age;
    location locate; //location locate = new location()

    public AggregationEx(String name, int age,location position) {
        this.name = name;
        this.age = age;
        this.locate=position;
    }

    void showData (){
        System.out.println("Name is "+ name+ "\nAge is"+age+"\n location in city is " + locate.city+"\n location in state is " + locate.state+"\n location in country is "+ locate.country);
    }
    public static void main(String[] args) {
        location locationOne = new location("Yangon","Kachin","Myanmar");
        AggregationEx studOne = new AggregationEx("Mg Mya",16,locationOne);
        studOne.showData();

    }
}
