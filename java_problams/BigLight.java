package java_problams;
import java.util.*;
public class BigLight {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
	int  h1 = input.nextInt();
	int h2 = input.nextInt();
	int v1 = input.nextInt();
	int v2  = input.nextInt();
	input.close();
	boolean result = false;
    for(long i=h1, j = h2; i<=10000; i =i+v1,j=j+v2 ){
		// for; j<=10000; j=j+v2 ){
			if(i == j){
			result = true;
				break;
			}
		// }
	}
		System.out.println(result);
    }    
}

/*Qustion of BigLight*/
/*
Gian and Suneo want their heights to be equal so they asked Doraemons help. Doraemon gave a big light to both of them but both big lights have different speeds of magnifying. Let us assume the big light given to Gian can increase the height of a person by v1 m/s and that of Suneos big light is v2 m/s. At the end of each second Doraemon check if their heights are equal or not.

Given the initial height of Gian and Suneo, your task is to check whether the height of Gian and Suneo will become equal at some point or not, assuming they both started at the same time.
*/