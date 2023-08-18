package PracProgram;


import java.util.Scanner;

class StringNormal{
    public void stringprint(int n){
        String s = "";
        for(int i=0;i<=n;i++){
            s = s + (char) ('A' + i);
            //System.out.println(s);
        }
    }
}
class StringBuildervv{
    public void stringbbprint(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=n;i++){
            sb.append((char) ('A' + i)) ;
            //System.out.println(sb);
        }
    }

}
public class StringPerformance {
    public static void main(String[] args) {
        StringNormal sn = new StringNormal();
        StringBuildervv sbn = new StringBuildervv();
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        long start = System.currentTimeMillis();

        sn.stringprint(n);
        long end = System.currentTimeMillis();
        long result = end-start;
        System.out.println("String Performance Duration "+ result);

        long startsb = System.currentTimeMillis();
        sbn.stringbbprint(n);
        long endsb = System.currentTimeMillis();
        long resultsb = endsb -startsb;
        System.out.println("String Builder Performance Duration "+ resultsb);


    }
}
