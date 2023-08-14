enum Status{
    Running,Failed,Success,Waiting
}
// enum are named Constant

public class Enumeration {
    public static void main(String[] args) {
        Status s1 = Status.Success;
        Status s2 = Status.Failed;
        Status s3 = Status.Running;
        Status s4 = Status.Waiting;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


    }
}
