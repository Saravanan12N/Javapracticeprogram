import java.util.Arrays;
import java.util.Scanner;

public class Jagged2DArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows  = sc.nextInt();
        int[][] arr = new int[rows][];
        for(int i=0;i<rows;i++){
            System.out.print("Enter the columns");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            System.out.println("Enter the values");
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int[] result : arr){
            System.out.println(Arrays.toString(result));
        }
    }
}
//op
/*
Enter no of rows
2
Enter the columns3
Enter the values
1 2 3
Enter the columns4
Enter the values
5 6 7 8
[1, 2, 3]
[5, 6, 7, 8]
*/