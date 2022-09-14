package DSA.LinkList;

public class AddNodeInLastOfLinkList {
public static void main(String[] args) {
     /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
    Node head = null;
    Node a1 = new Node(10);
    head = a1;
    Node a2 = new Node(11);
    a1.next = a2;
    Node temp = head;
    while(temp.next!=null){
        temp = temp.next;
    }
    Node a3 = new Node(12);
    temp.next = a3;
    Node temp2 = head;
    while(temp2.next!=null){
      
        System.out.println(temp2.data);
        temp2 = temp2.next;
    }

   
}    
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;

    }
}
