interface Computer{
    void show();
    void add();
}

class Laptop implements Computer{
    @Override
    public void add() {
        System.out.println("Add is printed");
    }

    @Override
    public void show() {
        System.out.println("in Laptop Class");
    }
}

public class InterfaceBasic {
    public static void main(String[] args) {
        Laptop ll = new Laptop();
        ll.add();
        ll.show();
    }
}
/*
op
Add is printed
in Laptop Class
 */