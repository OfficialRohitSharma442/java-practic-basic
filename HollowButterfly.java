 /*
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        * 
 */
import java.util.*;
public class HollowButterfly {
  
 public static void main(String args[]) {
  Scanner input =new Scanner(System.in);
  int n=input.nextInt();
 for(int i=1; i<=n; i++){
 for(int j=1; j<=i; j++){
  if(j==1||j==i){
   System.out.print("*");
  }else{
    System.out.print(" ");
  }
  }
  for(int k=1; k<=2*(n-i); k++){//this code make double of total langth of row and minus one 
    System.out.print(" ");//the space  take perfect space 
   }
   for(int l=1; l<=i; l++){
    if(l==1||l==i){
      System.out.print("*");
     }else{
       System.out.print(" ");
     }
   }
    System.out.println();
 }
 for(int i=n; i>=1; i--){
  for(int j=1; j<=i; j++){
   if(j==1||j==i){
    System.out.print("*");
   }else{
     System.out.print(" ");
   }
   }
   for(int k=1; k<=2*(n-i); k++){
     System.out.print(" ");
    }
    for(int l=1; l<=i; l++){
     if(l==1||l==i){
       System.out.print("*");
      }else{
        System.out.print(" ");
      }
    }
     System.out.println();
  }
    
 }   
}