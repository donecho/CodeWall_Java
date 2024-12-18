//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SuppressWarnings("ReassignedVariable")
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //for loop for(initialize;condition;count){sout}
        System.out.println("This is for loop");
        for(int num1=10; num1<30; num1+=2){
            System.out.print(num1+"\t");
        }

        System.out.println(" ");
        //while loop
        System.out.println("This is while loop");
        int num2 = 10;
        while(num2<20){
            System.out.print("_"+num2);
            num2++;
        }
    }
}