package PracProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }

    public static void primeRange(int A,int B){
        for(int i=A;i<=B;i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        primeRange(A,B);

    }
}
