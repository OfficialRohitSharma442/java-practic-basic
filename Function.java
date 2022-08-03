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
    /*calculate fectorial function*/
    public static void TwoCalculateFectorial(int n){
        int N =n;
        N=(N*(N-1))/2;
        System.out.print(N);
    }
    public static void main(String args[]){
    //   PrintmyName(" Hello Rohit");
    Scanner input =new Scanner(System.in);
    int a = input.nextInt();
    // int b =input.nextInt();
    //   System.out.println(SumOfTwo(a, b ));
    TwoCalculateFectorial(a);
    }
}
/*
function syntex 
   

--> return type function name( type argumant1, type agrument2){
    return 
}

 



*/
 