package Oops;
public class Encaptulation {
    public static void main(String[] args) {
      Test t1 = new Test();
        t1.setter(10);
        System.out.println(t1.getter());
  }
}
class Test{
String  name;
private float CGPA;
/* for getting the value*/
  public float getter(){
    return CGPA;
  }
  /* for setting CGPA */
  public void setter(float cgpa){
    this.CGPA = cgpa;
  }
}
/*
 Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting 
 on the data (methods) together as a single unit.In encapsulation, the variables  of a 
 class will be hidden from other classes, and can be accessed only through the methods of their current class.
*/