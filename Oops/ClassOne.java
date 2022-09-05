package Oops;

public class ClassOne {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color="red";
        pen1.type ="ball";
        System.out.println("color ="+pen1.color +"\n"+"pen type = "+pen1.type);
        pen1.write();
    }
}
class pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing somthing");
    }
}
