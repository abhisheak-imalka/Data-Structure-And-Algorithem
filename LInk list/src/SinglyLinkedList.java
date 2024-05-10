import java.sql.SQLOutput;

public class SinglyLinkedList {
    public ListNode head;


    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;

        }
    }
    public void printList(){
        ListNode current= head;
        while(current != null){
            System.out.print(current.data +" --> ");
            current= current.next;


        }
        System.out.println("null");


    }
    public void add_value_beginig(int addvalue){
        ListNode newnode=new ListNode(addvalue);
        newnode.next=head;
        head=newnode;

    }
    
    public int findLength(){
        int count =0;
        ListNode current=head;
        while(current != null){
           count++ ;
           current= current.next;

        }
        return count;
    }




}
