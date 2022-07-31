import java.util.Arrays;
public class pattern {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2 ,3, 5 ,4};
        int minvalue = Integer.MIN_VALUE;
        int maxvalue =Integer.MAX_VALUE; 
       for(int i=0; i<5; i++){
        if(arr[i]>minvalue){
            maxvalue = arr[i];
        }
        if(arr[i]>maxvalue && arr[i]<maxvalue){
            minvalue = arr[i];
        }
       }
        System.out.println(minvalue);
        System.out.println(maxvalue);
    }
}
