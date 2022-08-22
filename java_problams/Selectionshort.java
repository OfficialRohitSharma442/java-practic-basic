import java.util.*;
public class Selectionshort {
    public static void main(String args[]){
        int []arr ={6,4,3,5,2,1};
        // perform selection short
        for(int i=0; i<arr.length-2; i++){
            int min_index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min_index]){
                    min_index =j;
                }
            }  
             int temp = arr[min_index];
             arr[min_index] =arr[i];
             arr[i] = temp;
             for(int X:arr){
                System.out.print(X +" ");
             }
             System.out.println();
        }
    }
}
