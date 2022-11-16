public class PreFixSum {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = input.nextInt(); 
    }
    int prefix[] = new int[n];
      prefix[0] = arr[0];
      for(int i=1; i<n; i++){
        prefix[i] = prefix[i-1]+arr[i];
      }
      for(int x:prefix){
        System.out.print(x+" ");
      }
}
}
