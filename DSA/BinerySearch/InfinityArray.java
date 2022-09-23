import java.util.*;

public class InfinityArray {
    public static void main(String[] args) {
     int []arr ={1,2,3,4,5,6};
     int target = 3;
     System.out.print(FindingRange(arr,target));
  }
  static int FindingRange(int arr[],int target){
    int start  = 0;
    int end  = 1;
    while(target>arr[end]){
     int temp = end+1;
      end = end+(end-start+1)*2;
      start = temp;
    }
   return BinerySearch(arr,target,start,end);
    
  }
  static int BinerySearch(int arr[], int target, int start, int end){
   
        int mid;
        while (start<=end) {
            mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid; 
            }
           
        }
        return -1;
  }
}