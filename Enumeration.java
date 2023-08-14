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

        //Array Loop
        Status[] ss = Status.values();
        for(Status s : ss){
            System.out.println("Array result : "+ s);
        }


    }
}
/*
Success
Failed
Running
Waiting
Array result : Running
Array result : Failed
Array result : Success
Array result : Waiting
 */