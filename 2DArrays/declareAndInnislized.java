import java.util.*;

public class declareAndInnislized {
    /* declare and inisilized 2D array in java */ 
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int m =input.nextInt();
      int n=input.nextInt();
      int [][]arr = new int[m][n];
      for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            arr[i][j] = input.nextInt();
        }
      }
    /*printing 2D matrix*/
    System.out.println("printing 2D matrix");
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }   
    }
}
