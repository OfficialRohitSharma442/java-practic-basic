public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "hello my name is Rohit sharma";
        String []arr = str.split(" ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
