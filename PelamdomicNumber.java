/*  1
   212
  32123
 4321234
543212345 
*/
 
public class PelamdomicNumber {
    public static void main(String args[]) {
    //  pelandomic pattern
    int n = 5;
     for(int i=1; i<=n; i++){
        /* for spaces */
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        /*first half*/
        for(int k=i; k>=1; k--){
            System.out.print(k);
        }
        /*Secound half */
        for(int l =2; l<=i; l++){
            System.out.print(l);
        }
        System.out.println();
     }

    }
}
