package PracProgram;

class Paisa{
    public int Paisa(int money){
        money = money*200;
        System.out.println("PracProgram.Money inside scope " + money);
        return money;
    }
}

public class PassByValueDemo {
    public static void main(String[] args) {
        int money =100;
        Paisa pp =new Paisa();
        pp.Paisa(money);
        System.out.println("PracProgram.Money outside scope " + money);
    }
}
