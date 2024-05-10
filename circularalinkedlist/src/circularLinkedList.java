public class circularLinkedList{
    listnode head;

    public static class listnode{
        int data;
        listnode next;
       public listnode(int data){
            this.data =data;
            this.next=null;
        }
    }
    public void printCircle(){
        listnode temp=head.next;
        while(temp!=head){
            if(temp==head.next){
                System.out.print(head.data+" "+head.next.data+" ");
            }else {
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
    }
    public void insertNode(int addvalue){
        System.out.println("");
        listnode newnode = new listnode(addvalue);
        listnode temp=head;
        newnode.next=head.next;
        head.next=newnode;
        head=newnode;
    }
    public void deleteValue(){
        System.out.println("");
        listnode temp=head.next;
        while (temp!=head){
            if(temp.next.next==head){
                temp.next=null;
                temp.next=head;
                break;
            }
            temp=temp.next;
        }
    }

}
