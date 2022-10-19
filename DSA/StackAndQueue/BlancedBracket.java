package DSA.Stack And queue;
import java.util.*;

public class BlancedBracket {
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      int n = input.nextInt();
      String s = input.next(); 
    Stack<Character> str = new Stack<>();
    
    boolean flag = false;
    for(int i=0; i<n; i++){
      if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){ //in this condion we chek all are opening breacket

        str.push(s.charAt(i)); //push bracked in stack
       
      }else {  /
        if(!str.empty() && match(str.peek(),s.charAt(i))){ //check if pair of bracked match then remove pair
              str.pop();
                 }else {
                   System.out.println(false); //return false if no pair
                flag = true;   //flag for if here print false then another place not print anytihig
                   break;
                 }
        
      }
      
  }
  if(str.empty() && flag==false){ // if stack is empty after adding performing operation if stack empty thats menes all the breacket corret
        System.out.println(true);
    
  }else if(!flag){
    System.out.println(false);
  }
  
}
static boolean match (char open,char close){//this function for chaecking last breacket
  if(open=='['&&close ==']'){
    return true;
  }else if(open=='{'&&close =='}'){
    return true;
  }else if(open=='('&&close ==')'){
    return true;
  }
  return false;
  
}
}