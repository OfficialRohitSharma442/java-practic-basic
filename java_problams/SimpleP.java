import java.util.*;
public class SimpleP {
public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int num = 1;
    for(int i=1; i<10; i++){
       
        
        if(i%2!=0 ){
            
        for(int j=1; j<=i; j++){
            if(a!=num || a!=i)
        System.out.print(num);
       
        }
        ++num;
        System.out.print(" ");
       
    }
    }
    
}    
}
/*
****1
***222
**33333
*4444444
555555555 

*/