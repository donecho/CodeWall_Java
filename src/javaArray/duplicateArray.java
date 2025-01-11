package javaArray;

public class duplicateArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,4,5,6,6,7,9,9,10};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]){
                    System.out.print(numbers[j]+"_");
                }
            }
        }
        System.out.println();
    }
}
