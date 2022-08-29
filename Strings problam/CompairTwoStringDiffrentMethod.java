public class CompairTwoStringDiffrentMethod {
    public static void main(String[] args) {
     /* using equals  method   */
     String str = new String("welcome");
     String str1 = new String("Welcome");
     System.out.println("both string are Equal 'equals method' : "+str.equals(str1));
        /* using equalsto ignorecase() method  */
        System.out.println("both string are Equal 'equalsIgnoreCase' : "+str.equalsIgnoreCase(str1));
      /* compair to method */
      System.out.println("both string are Equal 'compareTo' : "+str.compareTo(str1)); 
      /* compareToEgnore cases  */
      System.out.println("both string are Equal 'compareToIgnoreCase' : "+str.compareToIgnoreCase(str1));
    }

}
