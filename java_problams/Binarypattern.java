import java.util.*;
        import java.lang.*;
        import java.io.*;
        
public class Binarypattern {
    public static void main(String args[]){
        
        
            Scanner sc =new Scanner(System.in);
              int n = sc.nextInt();
              for(int i=1; i<=n; i++){
                for(int j=0; j<=n-i; j++){
                    if(i%2!=0)
                  System.out.print(1+" ");
                  else
                  System.out.print(0+" ");
                }
                
              }
            }
        }        
   
