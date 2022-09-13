package Oops;

public class Constructor {
    public static void main(String[] args) {
        TestParpuse t1 = new TestParpuse("amit", 10);
        t1.printInfo();
    }
    
}
class TestParpuse{
   
    String name;
    int age;
    TestParpuse(String name, int age){
        this.name = name;
        this.age = age;
    }
    void printInfo(){
        System.out.println("Name is => "+name+"  "+"age is => "+age );
    }
    

}
