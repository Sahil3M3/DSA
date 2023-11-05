package Q1;

public class List {
	public class Node
	{
		private int data;
		private  Node next;
		
		public Node(int d)
		{
			data=d;
			next=null;
		}
		
	}//Node
	private Node head;
	private Node tail;
	
	public List() {
		head=tail=null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	//addFirst()
	public void addFirst(int d)
	{
		Node nn=new Node(d);
		
		if(isEmpty())
			head=nn;
		else
		{
			nn.next=head;
			head=nn;
		}
	}//addFirst()
	//addLast()
		public void addLast(int d)
		{
			Node nn=new Node(d);
			if(tail==null)
				tail=nn;
			else
			{	
			tail.next=nn;
		    tail=nn;
			}	
		}//addLast()
	
		//deleteFirst()
public void delFirst()
{
	if(isEmpty())
	tail=null;
	else
		head=head.next;
	
}//delFirst()
//deleteLast()
public void delLast()
{
	if(tail==null)
		
}//delLast()

}//List
