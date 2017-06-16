
public class stacksUsingLL 
{
	private Node head;
	private int size;

	class Node
	{
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public boolean isEmpty()
	{
		if(size==0)
			return true;
		return false;
	}
	
	public void pushItem(int d)
	{	
		Node nn=new Node(d);
		if(head==null)
		{
			head=nn;
		}
		else
		{
			nn.next=head;
			head=nn;
		}
		size++;
	}
	public int popItem()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty.nothing to pop ");
			return -1;
		}
		
		int ans=head.data;
		head=head.next;
		size--;
		return ans;
	}
	public int peek()
	{
		if(head==null)
		{
			System.out.println("Stack is empty.nothing to peek");
			return -1;
		}
		return head.data;
	}
	public int sizeOfStack()
	{
		if(head==null)
		{
			System.out.println("Stack is empty.No size");
			return 0;
		}
		return size;
	}
	public void printStack()
	{
		System.out.println("");
		if(head==null)
		{
			System.out.println("Stack is empty ");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{			
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("");
	}
	
	public static void main(String[] args) 
	{
		stacksUsingLL st=new stacksUsingLL();
		System.out.println("popped item :"+st.peek());
		st.pushItem(1);
		st.pushItem(12);
		st.pushItem(13);
		st.pushItem(14);
		st.pushItem(15);
		st.printStack();
		System.out.println("Size Of stacks::"+st.sizeOfStack());
	
		System.out.println("popped item :"+st.popItem());
		System.out.println("popped item :"+st.popItem());
		System.out.println("popped item :"+st.popItem());
		System.out.println("popped item :"+st.popItem());
		System.out.println("stack now has :");
		System.out.println("popped item :"+st.popItem());
		System.out.println("popped item :"+st.popItem());

	}

}
