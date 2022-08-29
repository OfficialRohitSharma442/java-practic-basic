import java.util.*;
public class ThreeFector {
    public static void main(String args[]){		
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      int []arr = new int[size];
      int []resultarr = new int[size];
      for(int i=0; i<size; i++){
        arr[i]= input.nextInt();
        
      }
      for(int i=0; i<size; i++){
        int counter =0;
        for(int j=1; j<=size; j++){
          if(arr[i]%j==0){
            counter++;
          }
        }
        // System.out.println(counter +" ");
        if(counter==3){
          resultarr[i]=1;
        }else{
          resultarr[i]=0;
        }
      }
      for(int x:resultarr){
        System.out.print(x+" ");
      }
   }
}
