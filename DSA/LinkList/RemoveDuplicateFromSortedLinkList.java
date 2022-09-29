package DSA.LinkList;
import java.util.*;

public class RemoveDuplicateFromSortedLinkList {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Node head = null;
      int n = input.nextInt();
      for(int i=0; i<n; i++){
        head = InsertAtEnd(head, input.nextInt());
      }
    Node head1=  removeDuplicate(head);
      printLinkList(head1);
  }
  static Node  removeDuplicate(Node head){
    if(head.next ==null){ //if sigle node in linllist return as it is
      return head;
    }
    Node temp = head;
    while(temp.next!=null){
      //check if any duplict value in linklist then we cut the link and addd link to another node
      if(temp.data==temp.next.data){
        temp.next = temp.next.next;
        
      }else{//move only one s
        temp = temp.next;
      }
      
    }
    return head;
    
  }
  static Node InsertAtEnd(Node head, int data){
    Node newNode = new Node(data);
    if(head==null){
       head = newNode;
       return head;
    }
   Node temp = head;
   while(temp.next!=null){
     temp = temp.next;
   }
   temp.next = newNode;
  
   return head;
  }
  static void printLinkList(Node head){
    Node temp= head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
  }
}
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}