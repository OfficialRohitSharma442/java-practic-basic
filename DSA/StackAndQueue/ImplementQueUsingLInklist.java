import java.util.*;
public class ImplementQueUsingLInklist {
    public static void main(String[] args) {
    
    //  Node ImplementQueUsingLInklist = new ImplementQueUsingLInklist(0);
    ImplementQueUsingLInklist ll = new ImplementQueUsingLInklist();
    ll.push(1);
    ll.push(2);
    ll.push(3);
    ll.push(4);
    ll.push(5);
      Node temp = ll.head;
      while(temp!=null){
        System.out.println(temp.data);
        temp = temp.next;
      }  

    }
    Node head;
    Node tail;
    void push(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            tail = n;
            return;
            
        }else{
            n.next = tail;
            tail = n;
            
        }
    }
    int pop(){
        if(head==null){
            return -1;
        }else{
            int deleted_value = head.data;
            head = head.next;
            if(head==null)tail = null;

            return deleted_value;
        }
    }
    class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }
}
