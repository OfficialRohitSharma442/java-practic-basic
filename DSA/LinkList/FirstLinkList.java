package DSA.LinkList;

public class FirstLinkList {

 public static void main(String[] args) {
    Node head = null;
    Node a1 = new Node(10);//set value in data part 
    head = a1;
    Node a2 = new Node(20);
    a1.next = a2;
    Node a3 = new Node(30);
    a2.next = a3;
    /* Type how we can print node */
    // System.out.println(head.next.next.data);//this is a way to print third node data becous head have a1 node and every node contcted to each other thats way we use head.next.next.data
    // System.out.println(head.next.data);
    //using for loop print last node address but in this approch we are loosing our all node address 

    // for(int i=1;i<3; i++){
    //     head = head.next;
    // }
    // System.out.println(head.data);
    /* usign for loop print node
       without loosing any king of address
       */
     Node temp = head;
    for(int i=0;i<3; i++){
       System.out.println(temp.data);
       temp = temp.next;

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