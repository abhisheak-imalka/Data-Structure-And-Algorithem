
//create linkedlist
public class myNode{
	int data;
	myNode next;
	
	public myNode(int data,myNode next){
		this.data=data;
		this.next=next;
		
	}
	

	
	//Searching value
	
	
	public void searchvalue(int searchingValue,myNode head){
		myNode current=head;
		
		while(current!=null){
			if(current.data==searchingValue){
				System.out.println("\n found");
			}
			current=current.next;
			
			
			
		}
	}
	void deleteLast(myNode head){
		myNode current=head;
		while(current != null){
			if(current.next.next==null){
				current.next=null;
				System.out.println("Last element deleted");
			}
			current=current.next;
		}
		
		
	}
	//function for deleting search value we can use this method for delete value anywhere
	
	
	void deletesearchvalue(int deletesearchvalue,myNode head){
		myNode current=head;
		while(current!=null){
			if(current.next.data==deletesearchvalue){
				current.next=current.next.next;
				System.out.println("deleted searchingValue");
				break;
			}
			current=current.next;
			
			
		}
		
		
	}
	
	//insert valu at last
	
	void insertvalueLast(int insertvalue,myNode head){
		myNode current=head;
		while(current!=null){
			if(current.next==null){
				current.next=new myNode(insertvalue,null);
				System.out.println("inserted value");
				break;
			}
			current=current.next;
			
		}
		
		
	}
	
	//insert value anywhere at linkedlist
	
	void insertvalue(int insertvalue,int positiondata,myNode head){
		myNode current=head;
		while(current!=null){
				if(current.next.data==positiondata){
					current.next=new myNode(80,current.next);
					
					System.out.println("inserted value");
					break;
				}
				current=current.next;
		}
		
	}

	
}
