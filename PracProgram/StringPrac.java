package PracProgram;

public class StringPrac {


    public static void main(String[] args) {
        // String object using constructor. here string is not stored in string pool constant

        String ss = new String("Saravanan Nallakamu");
        String s1 = new String("Saravanan Nallakamu");
        System.out.println("String Constructor Creation");
        if(ss == s1){
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Not Equal");
        }


        //another method
        System.out.println("String normal method");
        String s2 = "Sarav";
        String s3 = "Sarav";

        if(s2==s3){
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Not Equal");
        }



    }
}
/*
String Constructor Creation
Not Equal
String normal method
Both are equal
 */