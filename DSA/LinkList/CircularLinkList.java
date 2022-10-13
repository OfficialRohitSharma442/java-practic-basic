package DSA.LinkList;

public class CircularLinkList {
    public static void main(String[] args) {
        CircularLinkList cl = new CircularLinkList();
        cl.insertfirst(1);
        cl.insertfirst(2);
        cl.insertfirst(3);
        cl.insertfirst(4);
        cl.insertfirst(5);
        cl.insertfirst(6);
        cl.DeleteNode(6);
        cl.printCirculerLinkList();

    }
    Node head;
    Node tail;
    public void insertfirst(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            tail = n;
            return;
        }
        tail.next=  n;
        n.next = head;
        tail = n;

    }
    public void printCirculerLinkList(){
        Node temp = head;
        if(head!=null){
            do{
            System.out.print(temp.data+" ");
            temp = temp.next;
            }while(temp!=head);
        }
    }
    public void DeleteNode(int val){
        
     Node temp = head;
     if(temp==null){
        return;
     }
     
     if(head.data==val){
        head = head.next;
        tail.next = head;
       
        return;
     }  
     System.out.println("calling deleteNOde function");
     do {
        Node n = temp.next;
        if(n.data==val){
            temp.next = n.next;
            break;
        }
        temp = temp.next;
     } while (temp!=head);
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            
        }
    }
}
