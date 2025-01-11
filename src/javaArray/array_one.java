package javaArray;

public class array_one {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60}; //initialize
        String [] name =new String[] {"AungHla","MgMya", "MgBa","MgKwa","MgAung", "MaMya"};

        System.out.println(numbers +" is object for int");
        System.out.println(name+" is object for string");

        System.out.println(numbers[1]);
        System.out.println(name[5]);
        System.out.println("This is number of array room "+name.length); //

        name[5] ="Mg Mya";
        System.out.println(name[5] +" is replace in Ma Mya");

        //for name
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]+"\t");
        }

        System.out.println();
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.print(name[i]+"\t");
        }

        System.out.println();
        for (String s : name) {
            System.out.print(s + "\t");
        }

        String [] language = new String[5];
        language [0] = "Java";
        language [1] = "Python";
        language [3] = "React";
        language [4] = "Laravel";

        System.out.print("\n");

        for (int i = 0; i < language.length; i++) {
            System.out.print(language[i] +"\t");
        }

        System.out.println();

        int [] num = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
        }

        System.out.println();
        for (int j : num) {
            System.out.print(j + "\t");
        }



    }
}
