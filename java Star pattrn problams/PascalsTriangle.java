import java.util.Scanner;
import java.io.*;
 
public class PascalsTriangle {
    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main(String[] args)
    {
        int i, j;
        Scanner s = new Scanner(System.in);
      
        System.out.print("Enter the Row Size of Pascal Triangle: ");
        int n = s.nextInt();
        PascalsTriangle tri = new PascalsTriangle();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
 
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
 
                System.out.print(
                    " "
                    + tri.factorial(i)
                          / (tri.factorial(i - j)
                             * tri.factorial(j)));
            }
            System.out.println();
        }
    }
}