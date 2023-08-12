
class A{
    public void show(){
        System.out.println("in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C");
    }
}

public class RuntimePoly {

    public static void main(String[] args) {
        A a1 =new B();
        a1.show();
        A a2 = new C();
        a2.show();
    }
}
