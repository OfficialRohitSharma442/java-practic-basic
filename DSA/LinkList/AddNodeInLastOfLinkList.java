package DSA.LinkList;

public class AddNodeInLastOfLinkList {
public static void main(String[] args) {
     /*creating node head and pass null by default
      * creating node 
      * gives us value to node 
      add more node with it
     */
    Node head = null;
    Node a1 = new Node(10);
    head = a1;
    Node a2 = new Node(11);
    a1.next = a2;
    Node temp = head;
    //go lo last node 
    while(temp.next!=null){
        temp = temp.next;
    }

    //add a node with last node
    Node a3 = new Node(12);
    temp.next = a3;
    //print all node
    Node temp2 = head;
  for(int i=0; i<3; i++){
    System.out.println(temp2.data);
    temp2= temp2.next;
  }

   
}    
}

class Node{
    /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;

    }
}
