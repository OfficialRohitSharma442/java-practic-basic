
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     System.out.println(isAnagram("aba","baa"));
     
  }
  public static boolean isAnagram(String str1 , String str2){
    int []count = new int[256]; /* make 256 array becouse the all alphabet ASCII value on 256   */
    for(int i=0; i<str1.length(); i++){ //this iterate all string  
        count[str1.charAt(i)]++;   //this incresr array if exjusting
        count[str2.charAt(i)]--;  //this decrese array if exjusting
    }
    for(int i=0; i<count.length; i++){
        if(count[i]!=0){   //if array all value zero then string anagram
          return false;
          
        }
    }
    return true;
  }
}
/* a string is anagram when then all charater repet is anothoer string if one char is missing or extera then string not anagram */


