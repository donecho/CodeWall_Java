package javaArray;

public class array_clone {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};

        int[] nClone = num.clone();
        for(int nc: nClone){
            System.out.print(nc+"\t");
        }
    }
}
