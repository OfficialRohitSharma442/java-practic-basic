package Oops;

public class Static {
    public static void main(String[] args) {
  Player p1 = new Player("Rohan");
  p1.details();
  Player p2 = new Player("Lalit");
  p2.details();
  }
  
}
class Player{
    int id;
    String name;
    static int playercount =0;
    Player(String name){
      this.name = name;
      this.id = ++playercount;
    }
    void details(){
      System.out.println("id  => "+id+ " name => "+name);
      // System.out.println(id+ ":"+name);
    }
  }