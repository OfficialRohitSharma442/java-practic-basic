public class Diamond_pettron {
    public static void main(String args[]){
        int n= 4;
        for(int i=1; i<=n; i++){
            /*for spaces */
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            /*for Stars*/
            for(int k = 1; k<=(2*i-1); k++){
                System.out.print("*"); 
            }
            System.out.println();
        }
        /*for revers the star pettron*/
        for(int i=n; i>=1; i--){
            /*for spaces */
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            /*for Stars*/
            for(int k = 1; k<=(2*i-1); k++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
