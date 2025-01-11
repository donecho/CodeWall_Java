package javaArray;

public class two_dimension_array {
    public static void main(String[] args) {
         int[][] number = new int[4][5];
         System.out.println(number[1].length);

         int[][] dNumber = {
                 {1,2,3,4,5,6},
                 {7,8,9,10,11,12,13},
                 {14,15,16,17,18,19,20}
         };

        System.out.println(dNumber[0][3]);

        dNumber[1][6] = 30;
        System.out.println(dNumber[1][6]);
        System.out.println(dNumber[0][0]);

        for (int row = 0; row < dNumber.length; row++) {
            System.out.println(dNumber[row].length +" is row length");
            for (int col = 0; col < dNumber[row].length ; col++) {
                System.out.print(dNumber[row][col] + "\t");
            }
        }
        System.out.println();

        for (int[] ints : dNumber) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
        }




        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i +"_");
        }
    }
}
