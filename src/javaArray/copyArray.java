package javaArray;

public class copyArray {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] copy= new int[6];
        System.arraycopy(num,4,copy,1,5);

        for(int nc:copy){
            System.out.print(nc+"\t");
        }
    }
}
