import java.util.*;
public class Function {
    /*two number sum function */
    public static int SumOfTwo(int a, int b)
    {
        return a+b;
    }
     /* print name function */
    public static void  PrintmyName(String name){
        System.out.println(name);
    }
    public static void main(String args[]){
    //   PrintmyName(" Hello Rohit");
    Scanner input =new Scanner(System.in);
    int a = input.nextInt();
    int b =input.nextInt();
      System.out.println(SumOfTwo(a, b )) ;
    }
}
/*
function syntex 
   

--> return type function name( type argumant1, type agrument2){
    return 
}

 



*/
 