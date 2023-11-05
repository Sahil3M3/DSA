package Q2;

public class List {
public class Node{
	private int data;
	private Node next;
	public Node(int d)
	{
		data =d;
		next=null;
	}
	
}
private Node tail;
public List()
{
	tail=null;
}

public boolean isEmpty()
{
return tail==null;	
}
//addFirst()
public void addFirst(int d)
{
	Node nn=new Node(d);
	
	if(isEmpty()) {
	tail=nn;
	nn.next=nn;
	}
	else {
	 nn.next=tail.next;
		tail.next=nn;
	}
	}
//addNode()
public void addnode(int d,int pos)
{
	Node nn=new Node(d);
	if(isEmpty())
	{tail=nn;
	nn.next=tail;
	}
	else
	{
		Node trav=tail;
		for(int i=0;i<pos-1;i++)
		trav=trav.next;	
		nn.next=trav.next;
		trav.next=nn;
			}
}//addnode
//deleteFrist
public void delFirst()
{
	if(isEmpty())
	System.out.println("Already empty");
	else
	{
		Node trav=tail.next;
		
	}
}//delFirst()

//delLast()
public void delLast()
{
	
	if(isEmpty())
	System.out.println("Already empty");
	else
	{
		Node trav=tail;
		while(trav.next!=tail)
			trav=trav.next;
		trav.next=tail.next;
		tail=trav.next;
	}
}//delLast()

//display review
public void display() {
    if (tail == null)
        return;

    Node current = tail.next;
    do {
        System.out.print(current.data + " -> ");
        current = current.next;
    } while (current != tail.next);

    System.out.println();
}

}//List
