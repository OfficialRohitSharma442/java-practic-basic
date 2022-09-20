package DSA.LinkList;
// import DeleteNodeLinkList.*;

public class JustTest {

   //store the node class first node of linklist
    static Node head;
   static Node insertAtEnd(Node head,int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            return head;
        }
        
         Node temp = head;
         //i need to travese at the last node
         while(temp.next!=null){
            temp = temp.next;

         }
         //temp is now storig the referance of last node
         temp.next = n;

          return head;

    }

    //function for printing the linklist
   public static Node PrintLinklist(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
return head;
    }

    public static void main(String[] args) {
        Node head = null;
      Node L1 = new Node(1);
    //   head=  L1.insertAtEnd(1);
    //   head= L1.insertAtEnd(2);
    //   head=L1.insertAtEnd(3);
    //   head= L1.insertAtEnd(4);
    //   head= L1.insertAtEnd(5);
    //   head= L1.insertAtEnd(6);
    //   head=L1.insertAtEnd(7);
      L1.PrintLinklist(head);
      
      

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