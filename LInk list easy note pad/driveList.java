public class driveList{
	public static void main(String args[]){
		
		// create linkedlist
		myNode head = new myNode(20,new myNode(30,new myNode(40,new myNode(50,new myNode(40,null)))));
		
		// print linkedlist
		
		System.out.print(head.data+"-->"+head.next.data+"-->"+head.next.next.data+"-->"+head.next.next.next.data);
		
		//searching value
		
		
	
		head.searchvalue(40,head);
		
		// deleteLast value in linkedlist
		head.deleteLast(head);
		//print 
		
		System.out.println(head.data+"-->"+head.next.data+"-->"+head.next.next.data+"-->");
		//call serach value delete function 
		
		head.deletesearchvalue(30,head);
		
		System.out.println(head.data+"-->"+head.next.data+"-->"+head.next.next.data+"-->");
		
		// 60 for last in linked list
		
		head.insertvalueLast(60,head);
		
		System.out.println(head.data+"-->"+head.next.data+"-->"+head.next.next.data+"-->"+head.next.next.next.data);
		
		head.insertvalue(90,50,head);
		System.out.print(head.data+"-->"+head.next.data+"-->"+head.next.next.data+"-->"+head.next.next.next.data+"-->"+head.next.next.next.next.data);
		
		
		
		
	
	}
	
	
	
	
}