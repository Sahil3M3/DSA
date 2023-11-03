
public class Stack {

private int a[];
private int top;
private final int size;
public Stack(int s)
{
	size=s;
	top=size-1;
	a=new int[size];
}

public void push(int d)
{
a[top--]=d;
}//push()
public int  pop()
{
int d=a[++top];
top--;
	return d;
}//pop()
public int peak()
{
	return a[top+1];
}
public boolean isfull()
{
	return top==-1;
}//isEmpty()
public boolean isEmpty()
{
	return top==size-1;
}
}

