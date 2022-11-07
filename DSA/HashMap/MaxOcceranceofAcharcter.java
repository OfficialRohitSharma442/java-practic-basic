package DSA.HashMap;
import java.util.*;
public class MaxOcceranceofAcharcter {
    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("abcabcbbaaddag"));
    }
    public static char getMaxOccuringChar(String line)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<line.length(); i++){
            char ch = line.charAt(i);
            if(hm.containsKey(ch)){
             hm.put(ch,hm.get(ch)+1);//this is for secound time incresaing frequency 
            }else{
                hm.put(ch,1);//this is for the first time inseration
            }
            
        }
        int maxFreq = 0;
        char ans =' ';
        for(Character ch:hm.keySet()){
            if(maxFreq<hm.get(ch)){
                maxFreq = hm.get(ch);
                ans = ch;
            }
        }
        return ans;
    }
}
