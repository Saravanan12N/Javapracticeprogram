package PracProgram;

import java.util.Arrays;

class PairSum {
    public int [] sumarray(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            if (arr[i] + arr[j] > target) {
                j--;
            } else if (arr[i] + arr[j] == target) {
                i++;
                j--;
                return new int[]{i,j};
            } else {
                i++;
            }
        }
        return new int[]{ };
    }
}

public class TwoPairSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,5,9};
        int target = 10;
        PairSum ps = new PairSum();
        System.out.println(ps.sumarray(arr,target));
    }

}
