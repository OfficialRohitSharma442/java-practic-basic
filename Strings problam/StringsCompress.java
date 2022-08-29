
public class StringsCompress{
    public static void main(String[] args) {
   String str = "aaabbbcccccdddddd";
   String str1 =str.substring(0,1);
   int count = 1;
   for(int i=1; i<str.length(); i++){
    char current = str.charAt(i);
    char prev = str.charAt(i-1);
    if(current==prev){
        count++;
    }else{
      if(count>1){
        str1+=count;
        count =1;
      }
      str1+=current;
    }
    
   }
   if(count>1){
      str1+=count;
      count =1;
    }
   System.out.println(str1);
    
  }
}