public class Main{
  public static void main(String[] args) {
    for(int i=1; i<=4; i++){  
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      for(int L=1 ; L<=(2*(4-i)); L++){
        System.out.print(" ");
      }
      for(int k=1; k<=i; k++){
        System.out.print("*");
      }
      System.out.println();
    }   
    for(int i=4; i>=0; i--){
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      for(int L=1 ; L<=(2*(4-i)); L++){
        System.out.print(" ");
      }
      for(int k=1; k<=i; k++){
        System.out.print("*");
      }
      System.out.println();
    }   
  }
}