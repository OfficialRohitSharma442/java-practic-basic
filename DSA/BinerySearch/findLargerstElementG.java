package DSA.BinerySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class findLargerstElementG {
public static void main(String[] args) {
    char []arr = ['c','f','j'];
    char target = 'a';
    System.out.println(nextGreatestLetter(arr,target));
}   
public static char nextGreatestLetter(char[] arr, char target) {
    int start = 0;
    int end = arr.length-1;
      
       while(start<=end){
          int mid = start+(end-start)/2;
        if(target<arr[mid]){
          end = mid-1;
       }else{
           start = mid+1;
       }
           
       }
     
       return arr[start%arr.length];
       
   } 
}
