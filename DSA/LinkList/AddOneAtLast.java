package DSA.LinkList;
import java.util.*;

public class AddOneAtLast {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int n = input.nextInt();
   Node head = null;
   Node ptr = head;
   while(n>0){
     int rem = n%10;
     n=n/10;
     Node temp = new Node(rem);
     if(head==null){
       head = temp;
       ptr = head;
       continue;
     }
     ptr.next = temp;
     ptr = ptr.next;
     
   }
   int carry = 1;
   ptr = head;
   while(ptr!=null){
     int val = ptr.val;
     val+=carry;
     int rem =  val%10;
     ptr.val = rem;
     carry = val/10;
     ptr = ptr.next; 
   }
   ptr = head;
   if(carry!=0){
     Node temp = new Node(carry);
     while(ptr.next!=null){
       ptr = ptr.next;
     }
     ptr.next = temp;
   }
   head = reverse(head);
  // head =reverse(head);
   ptr = head;
   while(ptr!=null){
     System.out.print(ptr.val+" ");
     ptr = ptr.next;
   }
   
  }
  public static Node reverse(Node head){
    Node prev = null;
    Node curr = head;
    while(curr!=null){
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
    
  }
}
class Node{
  int val;
  Node next;
  Node(int val){
    this.val = val;
    this.next = null;
  }
}