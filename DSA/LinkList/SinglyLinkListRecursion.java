import java.util.*;
public class SinglyLinkListRecursion {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       Node head = null;
       for(int i=0; i<n; i++){
         insert(head,input.nextInt());
       }
    
    }
     static Node insert(Node head,int data){
        Node new_node = new Node(data);
        if(head==null){
            head = new_node;
            // System.out.println("node insert succesfully");
            return head;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=new_node;
        // System.out.println("node insert succesfully");
            return head;
    }
    public void InsertUsingRecursion(int data,int position){

    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
