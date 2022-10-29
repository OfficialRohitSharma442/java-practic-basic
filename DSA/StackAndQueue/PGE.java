import java.util.*;
public class PGE {
    
        public static void main(String[] args) {
        int arr[] = {1,3,4,2};
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
        while(!st.empty() && arr[i]>=st.peek()){
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
