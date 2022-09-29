import java.util.*;
public class MargeTwoSortedLinklist {
    public static void main(String[] args) {
      Node head1 = null;//this is first linklist node head2
      Node head2 = null;//this is secound linklist head
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();//size of first linklist
      for(int i=0; i<n; i++){
        head1 = insrtAtEnd(head1,input.nextInt());//this is a wey to insrt data in linkllist 
      }
      int m = input.nextInt();//size of secound linkllist
      for(int i=0; i<m; i++){
        head2 = insrtAtEnd(head2,input.nextInt());//this is a wey to insrt data in linkllist 
      }
   Node head = MargeTwoLinklist(head1,head2);
   printLL(head);
  }
  static Node MargeTwoLinklist(Node head1,Node head2){
    if(head1 ==null){//we check if one linklist is empty then it return another linklist
      return head2;
    } 
    if(head2==null){//we check if one linklist is empty then it return another linklist
      return head1;
    }
    //this code set head in correct position
    Node head; //this is new node of new linklist;
    if(head1.data<head2.data){//this code set head where we set first time our head
      head = head1;
      head1= head1.next;
    }else{
      head = head2;
      head2 = head2.next;
    }
    //this point last node of linklist
    Node temp = head;
    //insert link list in temp;
    while(head1!=null && head2!=null){
      if(head1.data<head2.data){
        temp.next = head1;
        head1 =head1.next;
        temp = temp.next;
      }else{
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }
    // one link list small then other so we insert all other node in new linklist
    if(head1==null){
      temp.next = head2;
    }
    if(head2==null){
      temp.next = head1;
    }
    // we return head becouse this head reperset our new linklist 
    return head;
    
    
  }
  //this function for insrt node at the end of linklist
  static Node insrtAtEnd(Node head,int data){
    Node newNode = new Node(data);
    if(head==null){//we check if no Exsating node in head then insrt data at first position 
      head = newNode;
      return head;
    }
    Node temp = head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next = newNode;
    return head;
    
  }
  //this function for printing linklist
  static void printLL(Node head){
    Node temp = head;
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
