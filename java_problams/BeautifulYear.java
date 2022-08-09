import java.util.*;
import java.lang.*;
import java.io.*;

public class BeautifulYear
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner input  = new Scanner(System.in);
			int year = input.nextInt();
			//   int temp =0; 
			boolean flag = true;
			while(flag){
			
				int i  =year+1;
			int a = i%10;
			i= i /10;
			int b=i%10;  
			i= i/10;
			int c=i%10;
				i=i/10;
			int d =i;
			if(a!=b &&a!=c&&a!=d&&b!=c&&b!=d&&c!=d &&a!=d){
				System.out.println(year+1);
			break;
			}else{
				year++;
			}
			//    temp  =year;
		
			}
     
	}
}