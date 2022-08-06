import java.util.*;
// import java.lang.*;
import java.io.*;



public class BeautifulYear {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int year = input.nextInt();
     int []arr = new int[4];
	 for(int i=0;  year>0; i++){
	   int index =0;
       int a  = year%10;
	     arr[index]=a;
	     index++;
	 }
 for(int x:arr){
	 System.out.println(x);
 }

}    
}
