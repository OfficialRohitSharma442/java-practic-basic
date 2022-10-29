import java.util.*;
public class NGE {
     public static void main(String[] args) {   
        int arr[] = {1,3,2,4};
        int ans[] = new int[4];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
        while(!st.empty() && st.peek()<=arr[i]){
          st.pop();
        }
        if(st.empty()){
          ans[i] = -1;
        }else{
          ans[i] = st.peek();
        }
        st.push(arr[i]);
        }
        for(int x:ans){
          System.out.print(x+" ");
        }
      }
}
