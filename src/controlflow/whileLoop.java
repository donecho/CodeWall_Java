package controlflow;

public class whileLoop {
    public static void main(String[] args){
    //whileLoop | while(condition){out.++}//do{out.++}while();

        int a = 10;
        while(a<20){
            System.out.print(a+"\t");
            a++;
        }
        System.out.println();
        System.out.println(a);

        do{
            System.out.print(a+"_\t");
            a-=2;
        }while(a>1);


    }
}
