public class Main {
    public static void main(String[] args) {
        doublylinkedlist sll =new doublylinkedlist();
        sll.insertLast(1);
        sll.insertLast(10);
        sll.insertLast(15);
        sll.insertLast(25);

        //print list
        sll.printlist();
        sll.printbackward();
        sll.addBeging(56);
        sll.printlist();

        //add value to middle
        sll.addmiddle(10,35);
        sll.printlist();

        //delete first value
        sll.deletefirst();
        sll.printlist();

        //dele last
        sll.Deletelast();
        sll.printlist();

        //delete position value
        sll.Delete_position_Value(10);
        sll.printlist();


    }
}