package PracProgram;

import java.util.Arrays;
// same reference is passed. so its behave like call be reference,
// output will be same
// but there is no call by reference in java
class Money{
    public void MoneyDouble(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]*2;

        }
        System.out.println("Called One :" +Arrays.toString(arr));

    }
}
public class PassByObject {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        Money mm = new Money();
        mm.MoneyDouble(arr);
        System.out.println("Actual One "+ Arrays.toString(arr));

    }

}
//op
//Called One :[20, 40, 60, 80]
// Actual One [20, 40, 60, 80]
