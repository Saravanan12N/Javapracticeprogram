package PracProgram;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.ensureCapacity(10);
        sb.append(" World");
        sb.append(" World");
        sb.append(" World");
        sb.append(" World");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());
    }
}
/*
Hello World World World World
44
 */