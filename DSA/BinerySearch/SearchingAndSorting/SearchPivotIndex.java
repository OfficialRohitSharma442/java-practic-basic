package SearchingAndSorting;
public class SearchPivotIndex {
    public static void main(String[] args) {
      int []arr = {1,7,3,6,5,6};
     System.out.println(Istapproch(arr));
     System.out.println(secoundapproch(arr));
     
    }
    // System.out.println("hello");

     public static int Istapproch(int []arr){
        for(int i=0; i<arr.length; i++){
            if(leftsum(arr,i)==rightsum(arr,i)){
            return i;
            }
     }
     return -1;
    }

    public static int leftsum(int arr[],int index){
        int sum = 0;
        for(int i=index-1; i>=0; i--){
            sum+=arr[i];
        }
        return sum;
    }
    public static int rightsum(int arr[],int index){
        int sum = 0;
        for(int i=index+1; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int secoundapproch(int []arr){
        int sum = 0;
        for(int x:arr) sum+=x;
        int leftsum=0;
        int rightsum =sum;
        for(int i=0; i<arr.length; i++){
            rightsum = rightsum-arr[i];
            if(leftsum==rightsum)return i;
            leftsum +=arr[i];
        }
        return -1;
    }

}
