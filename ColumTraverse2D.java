import java.util.Arrays;

public class ColumTraverse2D {
    public static void main(String[] args) {
        int arr[][] = { { 1,2,3,4} , {5,6,7,8}, {9,10,11,12}};

        for(int [] result:arr){
            System.out.println(Arrays.toString(result));
        }

        int rows = arr.length;
        int cols = arr[0].length;

        for(int col =0;col<cols;col++){
            if(col%2==0){
                for(int row =0;row<rows;row++){
                    System.out.println(arr[row][col]);
                }
            }
            else{
                for(int row=arr.length-1;row>=0;row--){
                    System.out.println(arr[row][col]);
                }
            }

        }
    }
}

/*
op

[1, 2, 3, 4]
[5, 6, 7, 8]
[9, 10, 11, 12]
1
5
9
10
6
2
3
7
11
12
8
4

 */
