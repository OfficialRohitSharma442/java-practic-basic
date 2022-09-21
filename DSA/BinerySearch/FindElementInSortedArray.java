package DSA.BinerySearch;

public class FindElementInSortedArray {
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,7,8,9,10,12,14,16,18,36,48};
int target = 3;
System.out.println(binerySearch(arr,target));

    }
    static int binerySearch(int []arr, int target){
        int n = arr.length-1;
        int start = 0;
        int end = n;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
            return -1;
        }
}


