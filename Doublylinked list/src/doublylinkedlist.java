import java.util.NoSuchElementException;

public class doublylinkedlist {

    listnode head;
    listnode tail;
    int length;


    class listnode {
        int data;
        listnode next;
        listnode prev;

        listnode(int data) {
            this.data = data;

        }
    }

    public doublylinkedlist() {
        this.head = null;
        this.tail = null;
        this.length = 0;

    }

    public boolean isEmpty() {
        return length == 0; //head ==0;
    }

    public int length() {
        return length;
//finished creating doubly linked list

    }

    //
    public void insertLast(int value) {
        listnode newnode = new listnode(value);
        if (isEmpty()) {
            head = newnode;
        } else {
            tail.next = newnode;

        }
        newnode.prev = tail;
        tail = newnode;
        length++;
    }

    public void printlist() {
        listnode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
        // System.out.println("");


    }

    void printbackward() {
        listnode temp = tail;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.prev;
        }
        System.out.println("null");

    }

    void addBeging(int addvalue) {
        listnode temp = head;
        listnode newnode = new listnode(addvalue);
        if (isEmpty()) {
            tail = newnode;
        } else {
            head.prev = newnode;
        }
        newnode.next = head;
        head = newnode;

    }

    void addmiddle(int position, int addvalue) {
        listnode newnode = new listnode(addvalue);
        listnode temp = head;
        listnode temp2;
        while (temp != null) {
            if (temp.data == position) {
                //newnode=temp.next;
                //temp.next=newnode;
                newnode.prev = temp;
                newnode.next = temp.next;
                temp.next = newnode;
                temp.next.prev = newnode;
                break;
            } else {
                temp = temp.next;
            }

        }
    }

    public listnode deletefirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        listnode temp = head;
        if(temp==null){
            tail=null;
        }else{
            temp.next.prev=null;

        }
        head= temp.next;
        temp.next=null;
        length--;
        return temp;

    }
    public listnode Deletelast(){
        if(isEmpty()){
            throw new NoSuchElementException();

        }
        listnode temp=tail;
        if(temp==null){
            head=null;
        }else{
            temp.prev.next=null;
        }
        tail=tail.prev;
        temp.prev=null;
        length--;
        return temp;

    }
    public void Delete_position_Value(int position){

        listnode temp=head;
        while (temp!=null){
            if(temp.data==position){

                temp.prev.next=temp.next;

                temp.next.prev=temp.prev;
                temp.next=null;
                temp.prev=null;


                break;

            }else {
                temp=temp.next;
            }

        }
    }
}