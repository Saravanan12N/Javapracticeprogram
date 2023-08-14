package PracProgram;

class Calculator{

    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }

}

class AdvCalculator extends Calculator{
    public int mul(int a,int b){
        return a*b;
    }

    public int div(int a,int b){
        return a/b;
    }
}

public class InheritProg {
    public static void main(String[] args) {
        AdvCalculator acl = new AdvCalculator();
        System.out.println("PracProgram.AdvCalculator Inherit Result :" + acl.add(2,3));
    }
}
