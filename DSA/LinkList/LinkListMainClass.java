package DSA.LinkList;
// import DSA.LinkList;

public class LinkListMainClass {
    public static void main(String[] args) {
        SinglyLinkList ll = new SinglyLinkList();
     
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.insertFirst(6);
        ll.insertFirst(7);
        ll.insertLastindex(10);
        ll.insertLastindex(11);
        ll.insertLastindex(12);
        ll.insrtAtSpecific(77,5);
    //    System.out.println( ll.deleteatFirstPosition());
        //  ll.deleteLastIndex();
        System.out.println(ll.deleteSpecificIndex(2));
        // System.out.println(ll.deleteLast());


        ll.PrintLinkList();        
    }
}
