package PracProgram;

public class Divisor {
    public static void main(String[] args) {
        int num = 36;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                System.out.println(i);
                System.out.println(num/i);
            }
        }
    }
}
/*
1
36
2
18
3
12
4
9
6
6
 */