import java.util.*;

public class AddOneIntLinkList {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      Node head = null;
      while(num!=0){
        int digit = num%10;
        num = num/10;
        head = AddLinklist(head,digit);
      }
    head =  addOneOnLinkList(head);
    
        head = reverse(head);
        printLinklist(head);
  }
  static Node reverse(Node head){
          if(head==null||head.next==null){
            return head;
          }
          Node previous=head;
          Node currNode=head.next;
          while(currNode!=null)
          {
        Node nextNode=currNode.next;
        currNode.next=previous;
        //Update
         
        previous=currNode;
        currNode=nextNode;
          }
        head.next=null;
        head=previous;
        return head;
        }
   static Node addOneOnLinkList(Node head){
     int carry =1;
     Node temp = head;
     while(temp!=null){
    int data_of_node = temp.data;
    data_of_node+=carry;
    int remander = data_of_node%10;
    temp.data = remander;
    carry = data_of_node/10;
    temp = temp.next;
     }
     if(carry!=0){
      head = AddLinklist(head ,carry);
     }
     return head;
   }
  static Node AddLinklist(Node head,int data){
    Node newOne = new Node(data);
    
    if(head==null){
      head = newOne;
      return head;
    }
    Node temp = head;
    while(temp.next!=null){
      temp = temp.next;
    }
    temp.next = newOne;
    return head;
    
  }
   static void printLinklist(Node head){
        Node temp = head;

        while(temp!=null){
           
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
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