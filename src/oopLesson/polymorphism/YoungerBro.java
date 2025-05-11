package oopLesson.polymorphism;



public class YoungerBro{
    WorkFromMom work; //new Older Brother

    YoungerBro(WorkFromMom obj){
        this.work = obj;
    }

    void doIt(){
        work.homework();
    }

}
