package PracProgram;

@FunctionalInterface
interface Lamda{
    void show();
}
public class LambdaExp {
    public static void main(String[] args) {
        Lamda bb  = () -> System.out.println("in Void show");
        bb.show();
    }

}
/*
in Void show
 */