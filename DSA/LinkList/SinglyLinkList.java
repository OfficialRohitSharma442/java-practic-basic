package DSA.LinkList;

public class SinglyLinkList {
    private Node head;
    private Node tail;
    private int size;
    public SinglyLinkList(){
        this.size = 0;
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if(tail==null){ //if tail is null it means one node on linklist
            tail = head;
        }
        size++;
    }
    public int deleteatFirstPosition(){
        int val = head.data;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    // public void  deleteLastIndex(){
    //  if(head==null){
    //     tail=null;
    //  }
    //  Node temp = head;
    //  while(temp.next.next!=null){
    //     temp = temp.next;
    //  }
    //  temp.next = null;
    // }
    //this function for delete node from specific position
    public int deleteSpecificIndex(int index){
    if(index==0){
        return deleteatFirstPosition();
    }
    if(index==size-1){
        return deleteLast();
    }
    Node prev = get(index-1);
    int val = prev.next.data;
    prev.next = prev.next.next;
    return val;

    }
    public int deleteLast(){
        if(size<=1){
            return deleteatFirstPosition();
        }
        Node secoundLast = get(size-1);
        int data = tail.data;
        tail = secoundLast;
        tail.next = null;
        return data;
    }
    //this function return node of given index    
    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }
    //this function insert data on specific position 
    public void insrtAtSpecific(int data,int index){
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index ==size){
            insertLastindex(data);
            return;
        }
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        Node newOne = new Node(data);
        Node tempNo = temp.next;
        temp.next = newOne;
        newOne.next = tempNo;
    }
    public void insertLastindex(int data){
        Node newOne = new Node(data);
        if(tail==null){
            insertFirst(data);
            return;
        }
        tail.next = newOne;
        tail = newOne;
        size++;
    }
    /* find node that have value that we given  */
    public Node findnode(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.data==value){
                return temp;
            }
            temp = temp.next;

        }
       return null;
    }
    public void PrintLinkList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    private class Node{
    private int data;
    private Node next;
    public Node(int data){
        this.data = data;
        this .next = null;
    }
    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    }

}
