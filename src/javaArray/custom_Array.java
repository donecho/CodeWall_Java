package javaArray;

public class custom_Array {
    public static void main(String[] args) {
        //initialize array
        int num[] = {1,1,3,4,5,6,7,8};
        int copy[] = new int[num.length]; //[0,0,0,0,0,0,0,0]

        System.out.println("This is before copy");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] +"\t");
        }
        System.out.println();



        System.out.println("This is after copy");
        for (int i = 0; i < num.length; i++) {
            copy[i]=num[i];
        }

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] +"\t");
        }
        System.out.println();

        //how to find the largest number
        int largestNumber = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]>largestNumber){
                largestNumber = num[i];
            };
        }
        System.out.println(largestNumber);

        //how to find the smallest number
        int smallestNumber = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]<smallestNumber) smallestNumber = num[i];
        }
        System.out.println(smallestNumber);


        System.out.println("This is sorting normal");
        int[] dNum = {10,1,9,2,3,3,4,5,6,7,8,8,10};
        int valueNow = 0;

        for (int i = 0; i < dNum.length; i++) {
            for (int j = i+1; j < dNum.length; j++) {
                if(dNum[i]>dNum[j]){
                    valueNow = dNum[i];
                    dNum[i] = dNum[j];
                    dNum[j] = valueNow;
                }
            }
        }

        for (int i = 0; i < dNum.length; i++) {
            System.out.print(dNum[i]+"\t");
        }
        System.out.println();
        System.out.println("This biggest");
        System.out.println(num[num.length-1]);


        System.out.println("This is reverse sort");
        for (int i = 0; i < dNum.length; i++) {
            for (int j = i+1; j < dNum.length; j++) {
                if(dNum[j] > dNum[i]){
                    valueNow = dNum[i];
                    dNum[i] = dNum[j];
                    dNum[j] = valueNow;
                }
            }
        }

        for (int i = 0; i < dNum.length; i++) {
            System.out.print(dNum[i]+"\t");
        }

        System.out.println();
        System.out.println("Second Smallest");
        System.out.println(dNum[dNum.length-2]);





    }
}
