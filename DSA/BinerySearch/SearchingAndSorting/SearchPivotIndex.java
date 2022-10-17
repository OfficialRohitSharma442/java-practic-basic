package SearchingAndSorting;
public class SearchPivotIndex {
    public static void main(String[] args) {
      int []arr = {1,7,3,6,5,6};
      for(int i=0; i<arr.length; i++){
        if(leftsum(arr,i)==rightsum(arr,i)){
            System.out.println(i);
        }
     
    }
    // System.out.println("hello");


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
}
