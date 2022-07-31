/*
    *****
   *   *
  *   *
 *   *
*****

 */
public class HollowRainbows { 
    public static void main(String args[]) {
        int n=5;
        for(int i=1; i<=n; i++){
            
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 ||i==5 ||j==1||j==5){ //this conditon made for printing Star on cornar
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}
