public class MargeSort {
    public static void main(String[] args) {
        int []arr = {0,6,4,3,6,2,1,5};
        devide(arr,0, arr.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
    public static void devide(int arr[], int si,int ei){
       if(si>=ei){
        return;
       }
        int mid = (si+ei)/2;
        devide(arr,si,mid);
        devide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void conquer(int arr[], int si, int mid,int ei){
        int merged[] =new int[ei-si+1];
        int indx1 = si;
        int indx2 = mid+1;
        int x =0;
        while(indx1<=mid && indx2<=ei){
            if(arr[indx1]<=arr[indx2]){
                merged[x++] =arr[indx1++];
            }else{
                merged[x++] = arr[indx2++];
            }
        }
        while(indx1<=mid){
            merged[x++] = arr[indx1++];
        }
        while(indx2<=ei){
            merged[x++] = arr[indx2++];
        }
        for(int i=0, j=si; i<merged.length; i++,j++){
            arr[j] =merged[i];
        }
    }
}
