package DSA.LinkList;

public class DoublyLinkList {
    public static void main(String[] args) {
        DoublyLinkList dll = new DoublyLinkList();
        dll.insertFirst(5);
        dll.insertFirst(4);
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(1);
        dll.insertLast(6);
        dll.PrintLinkList();
        dll.insertAtSpecificPosition(2,14);
        dll.PrintLinkList();
        // dll.PrintInReverse();
    }
    Node head;
    public void insertFirst(int data){
     Node n = new Node(data);
     n.next = head;
     n.prev = null;
     if(head!=null){
        head.prev = n;
     }
     head = n;

    }
    public void insertLast(int data){
        if(head==null){
            insertFirst(data);
            return;
        }
        Node n = new Node(data);
        Node temp = head;
        while(temp.next!=null){
         temp = temp.next;
        }
       temp.next = n;
       n.prev = temp;

       return;
    }
    public void insertAtSpecificPosition(int index ,int data){
      if(index==0){
        insertFirst(data);
        return;
      }
      Node n = new Node(data);
      Node temp = head;
      for(int i=0; i<index-1; i++){
       temp = temp.next;
      }
n.next = temp.next;
temp.next.prev = n;
n.prev = temp;
temp.next = n;
return;
    }
    public void PrintLinkList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void PrintInReverse(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            last = temp;
            temp= temp.next;
            
        }
        while(last!=null){
            System.out.print(last.data+"->");
            last = last.prev;
        }
        System.out.println("null");
        
    }
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
}
