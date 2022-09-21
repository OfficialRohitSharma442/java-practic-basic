package DSA.BinerySearch;
/* 
 we use this aproch when we dont know array sorted asanding or disanding order
*/
public class OrderAgnosticBS {
    public static void main(String[] args) {
        //first thing we know array is sorted assanding or desading order
       int []arr = {10,9,8,7,6,5,4,3,2,1};
       int target = 6;
        boolean IsAsc = arr[0]>arr[arr.length-1];
         System.out.println(binerySearchSortedArray(arr,target,IsAsc));
      
    }
    static int binerySearchSortedArray(int []arr,int target,boolean IsAsc){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid;
        while(start<=end){
          mid = start+(end-start)/2;
          
          if(arr[mid]==target){
            return mid;
          }
          if(IsAsc){    //in this we add two funtionalaty of two condion check link if increseing order or dectecsing order
            if(arr[mid]<target){
                end = mid-1;
               }else{
                 start = mid+1;
                
               }
          }else{
          
              if(arr[mid]>target){
                end = mid-1;
              }else{
                start = mid+1;
              }
          }
        
        }
        return -1;
    }
  
}
