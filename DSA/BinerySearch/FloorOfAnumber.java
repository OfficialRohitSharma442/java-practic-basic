package DSA.BinerySearch;
//this code use for calculate floor of a array using binery scarch 
public class FloorOfAnumber {
    public static void main(String[] args) {
        int []arr  = {1,2,3,6,8,9,11,13,15};
    int target = 10;
    System.out.println(ceilingOfANnumber(arr,target));
    }
    static int ceilingOfANnumber(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                return arr[mid];
            } 
        }
        // return Math.max(arr[start],arr[end]); 
        return arr[end];
    }
}
