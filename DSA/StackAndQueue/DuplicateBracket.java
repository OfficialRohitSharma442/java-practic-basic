import java.util.Scanner;
import java.util.Stack;

/**
 * DuplicateBracket
 * input sample ((a+b)+(b+c)) -->false
 * input sample ((a+b)+((a+b)))-->true
 */
public class DuplicateBracket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        //making  char type stack
     Stack<Character> st = new Stack<>();
     boolean flag = true;
     for(int i=0; i<str.length(); i++){
        char ch =str.charAt(i);
        
        if(str.charAt(i)==')'){
         //checking if peek element is opening bracket means bracket dont contain any value

             if(st.peek()=='('){
                System.out.println(true);
                flag = false;
                break;
             }else{
               //remove data whan then opening pracket not found
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
             }
        }else{
            st.push(ch);
        }
     }
 if(flag){
    System.out.println(false);
 }

    }
}