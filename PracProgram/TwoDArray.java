package PracProgram;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        //print address
        System.out.println(array);

        //print address of array object
        System.out.println(array[0]);

        //Loop

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
