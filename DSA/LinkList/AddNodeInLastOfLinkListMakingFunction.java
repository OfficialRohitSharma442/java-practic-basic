package DSA.LinkList;

public class AddNodeInLastOfLinkListMakingFunction {
    public static void main(String[] args) {
        Node head = null;
        head = InsertAtTheEnd(head,10);
        head = InsertAtTheEnd(head,11);
        head = InsertAtTheEnd(head,12);
        head = InsertAtTheEnd(head,13);
        head = InsertAtTheEnd(head,14);
        head = InsertAtTheEnd(head,15);
        head = InsertAtTheEnd(head,16);
        head = InsertAtTheEnd(head,17);
        head  =InsertAtTheStart(head, 500);
        size(head);
        printLinklist(head);
    } 
    /*
     * function add node last of linklist
     * chaek if head equal to null then its our first node then we insert data at first position
     * if head not equal to null then we find where is head.next is null becouse at last node next is null 
     * so we use while loop for this onec we found the last node we insert node 
     * then return new head
     * 
     * 
     */
    static Node InsertAtTheEnd(Node head, int data){
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
    /*
     * in this function we check size of linklist 
     * first we run while loop and increse size variable
     * loop run where head not equal to null
     * return size variable
     * 
    */
    static int size(Node head){
        Node temp = head;
        int size =0;
        while(temp!=null){
            temp =temp.next;
            size++;
        }
        System.out.println("size of linklist is => "+ size);
        return size;
    }
    /*
     * in this function we print the linklist
     * we go fist node to head->next null 
     * every time we print head->data
     *  
    */
    static void printLinklist(Node head){
        Node temp = head;

        while(temp!=null){
            if(temp.next!=null)
            System.out.print(temp.data+ " -> ");
            else
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    /*
     * in this function we insert node at the first position 
     * so we insert node and chage new node next to head
     * and we backword head to first position 
    */
    static Node InsertAtTheStart(Node head,int data){
    Node new_node = new Node(data);
    new_node.next = head;
    head = new_node;
 return head;

}
}
/*
 * this code is used template of node
*/
class Node{
    int data;
    Node next;
    Node(int data){
  this.data = data;
    }
}