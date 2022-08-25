public class PrintEvenString {
    public static void main(String[] args) {
        String str = "hell world";
        for(String s:str.split(" ")){
            if(s.length()%2==0){
                System.out.println(s); 
            }
        }
    }
}
