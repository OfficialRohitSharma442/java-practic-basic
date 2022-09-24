import java.util.Arrays;

public class BinerySearch2DMattrix {
public static void main(String[] args) {
    int [][]arr = {
         {1,2,3},
         {4,5,6},
         {7,8,9}

    };
    int target = 5;
    
    System.out.println(Arrays.toString(searchIn2Darray(arr,target)));
}   
static int[] searchIn2Darray(int arr[][], int target){
    int row = 0;
    int colum =arr.length-1;
    while(row<arr.length && colum>=0){
        if(arr[row][colum]==target){
            return new int[]{row,colum};
        }else if(arr[row][colum]>target){
            colum--;
        }else{
            row++;
        }
    }
    return new int[]{-1,-1};
} 
}
