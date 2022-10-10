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
        if(tail==null){ //if taill is null it means one node on linklist
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
