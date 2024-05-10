public class Main {
    public static void main(String[] args) {
        circularLinkedList cll=new circularLinkedList();
        cll.head=new circularLinkedList.listnode(10);
        circularLinkedList.listnode second= new circularLinkedList.listnode(15);
        circularLinkedList.listnode third= new circularLinkedList.listnode(20);
        circularLinkedList.listnode fourth=new circularLinkedList.listnode(25);
        circularLinkedList.listnode fifth= new circularLinkedList.listnode(30);
        circularLinkedList.listnode six = new circularLinkedList.listnode(35);
        circularLinkedList.listnode seven =new circularLinkedList.listnode(40);


        cll.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=six;
        six.next=seven;
        seven.next=cll.head;

        cll.printCircle();

        cll.insertNode(75);
        cll.printCircle();

        cll.deleteValue();
        cll.printCircle();

    }
}