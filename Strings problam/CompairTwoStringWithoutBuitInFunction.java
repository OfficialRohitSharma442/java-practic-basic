public class CompairTwoStringWithoutBuitInFunction {
 public static void main(String[] args) {
    String str  = "Ropit";
    String str1 = "Rohit";
    String message ="Equal"; 
    for(int i=0; i<str.length(); i++){
        if(str.charAt(i)!=str1.charAt(i)){
         message = "not equal";
            break;
        }
    }
System.out.println(message);
 }   
}
