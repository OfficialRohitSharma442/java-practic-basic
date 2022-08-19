import java.util.*;
import java.lang.*;
import java.io.*;

public class BabbleShort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int []arr =new int[size];
		for(int i=0; i<size; i++){
		  arr[i] =input.nextInt();
		}
		for(int i=0; i<size-1; i++){
		 for(int j=0; j<size-1-i; j++){
		  if(arr[j]>arr[j+1]){
		    int temp = arr[j];
		    arr[j] = arr[j+1];
		    arr[j+1]=temp;
		  }
		} 
		}
	  for(int x:arr){
	    System.out.print(x);
	  }
	}
}