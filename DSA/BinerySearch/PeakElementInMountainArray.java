public class PeakElementInMountainArray {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        int []arr  = {1,2,4,6,7,9,10,15,30,25,20,7,1,0};
       System.out.println(FindingRange(arr));
    }
    static int FindingRange(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
          int mid = start+(end-start)/2;
          if(arr[mid]>arr[mid+1]){
              //we are in dec part of array
              //then we search mid side
           end = mid;
          }else {
            start = mid +1;
          }
        }
       return arr[start];
        
      }
}
