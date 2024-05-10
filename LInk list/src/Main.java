public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();// create object
        sll.head = new SinglyLinkedList.ListNode((10));
        SinglyLinkedList.ListNode second = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode third = new SinglyLinkedList.ListNode(8);
        SinglyLinkedList.ListNode fourth = new SinglyLinkedList.ListNode(11);

        //now we connect them together to form a chain

        sll.head.next=second;//10-->1
        second.next=third;//10-->1-->8
        third.next=fourth;//10-->1-->8-->11-->null

        // Display Link List
        sll.printList();
        //find length in Link List
        System.out.println("Length of Sll Link list is:  "+sll.findLength());


        //Assign node beginning in the Linked List

        SinglyLinkedList.ListNode newnode=new SinglyLinkedList.ListNode(5);
        newnode.next=sll.head;
        sll.head=newnode;

        // display again new Linked List
        System.out.print("New Linked List is: ");
        sll.printList();



        //System.out.println("Hello world!");
    }
}

