import java.util.*;
public class InsertationSort {
    public static void main(String[] args) {
        int []arr ={9,6,3,4,5,8};
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            int j =i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            /* placement  */
            arr[j+1]=current;
        }
        System.out.println(Arrays.toString(arr));
     }

}
