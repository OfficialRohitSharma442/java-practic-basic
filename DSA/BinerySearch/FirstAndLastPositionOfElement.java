package DSA.BinerySearch;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        
    }
    static int[] SearchRange(int []arr , int target){
        int []ans ={-1,-1};
        /* check the first occurence of target first */
        int start  = search(arr, target,true);
        int end = search(arr, target,false);
        ans[0] = start;
        ans[end] = end;
        return ans;
       
    }
    /* this function just return value of index of target */
    static int search(int arr[],int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        int mid;
        while (start<=end) {
            mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;

            }else{
                ans =  mid; 
                if(findStartIndex==true){
                    end = mid-1;
                }else{
                    start  = mid+1;
                }
            }
           
        }
        return ans;
    }
}
