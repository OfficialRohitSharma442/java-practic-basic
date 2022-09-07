package Oops;

public class ClassOne {
    public static void main(String[] args) {
      Student s1 = new Student("Lalit", 22);
      s1.printInfo();
    }
}
class pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing somthing");
    }
    public void color(){
        System.out.println(this.color);
    }
}
class Student{
    String name ="Defaut Name";
    int age = 00;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name =name;
        this.age = age;
    }
}