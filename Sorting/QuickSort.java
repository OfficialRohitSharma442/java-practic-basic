public class QuickSort {
    public static void main(String[] args) {
        int []arr = {6,3,5,2,8};
    quicksort(arr, 0, arr.length-1);  
    for(int x:arr){
        System.out.print(x+" ");
    }  
    }
    public static void quicksort(int arr[], int low, int high){
      if(low<high){
        int pivotIndex =partition(arr, low , high);
        quicksort(arr, low,pivotIndex-1);
        quicksort(arr, pivotIndex+1,high);
      }
    }
    public static int partition(int arr[], int low, int high){
       int pivot = arr[high];
       int i =low-1;
       for(int j=low; j<high; j++){
        if(arr[j]<pivot){
            i++; 
            /* Swap */
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
       }
       i++;
       int temp = arr[i];
       arr[i] = pivot;
       arr[high] = temp;
       return i;
       
    }
}
