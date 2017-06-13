package linkedList;

public class ll {
	static Node head;
	
	class Node
	{
		private int data;
		private Node next;
		private Node prev;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		 
	public Node createNode(int data)
	{		
		Node nn=new Node(data);
		return nn;
	}
	public int getData()
	{
		return this.data;
	}
	public void setNext(Node nn)
	{
		this.next=nn;
	}
	public Node getNext()
	{
			return this.next;
	}
	public void setPrev(Node nn)
	{
		this.prev=nn;
	}
	public Node getPrev()
	{
		return this.prev;
	}		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ll l1= new ll();
		Node n0=l1.new Node(0);
		Node n1=l1.new Node(1);
		Node n2=l1.new Node(2);
		n1.setNext(n2);
		Node n3=l1.new Node(3);
		n2.setNext(n3);
		Node n4 =l1.new Node(4);
		n3.setNext(n4);
		n4.setNext(n2);
		head=n1;
		System.out.println(isCycle(head));
		System.out.println(cycleBegins(head));
		System.out.println(cycleLength(head));
	}
	private static int cycleLength(Node head2) 
	{
		int len=0;
		Node p1=head2;
		Node p2=head2;
		
		while(p1!=null && p2!=null)
		{
			if(p1.next!=null)
			{
				p1=p1.next.next;
			}
			if(p2.next!=null)
			{
				p2=p2.next;
			}
			if(p1!=null && p2!=null && p1.equals(p2))
			{
				break;
			}
		}
		if(p1!=null && p2!=null)
		{
			p2=head;
			while(p1!=p2)
			{
				p1=p1.next;
				p2=p2.next;
			}
		
			p2=p2.next;
			len++;
			while(!p1.equals(p2))
			{
				p2=p2.next;
				len++;
			}
		}	
		return len;
	}
	private static int cycleBegins(Node head2) 
	{
		Node p1=head;
		Node p2=head;
		boolean cycle=false;
		while(p1!=null && p2!=null)
		{
			if(p1.next!=null)
			{
				p1=p1.next.next;
			}
			if(p2.next!=null)
			{
				p2=p2.next;
			}
			if(p1!=null && p2!=null && p1.equals(p2))
			{
				cycle=true;
				break;
			}
		}
		if(p1!=null && p2!=null)
		{
			p2=head;
			while(p1!=p2)
			{
				p1=p1.next;
				p2=p2.next;
			}
			return p2.data;
		}
		return -1;
	}
	private static boolean isCycle(Node head2)
	{
		Node p1=head2;
		Node p2=head2;
		if(head2==null)
			return false;
		
		while(p1!=null && p2!=null)
		{
			
			if(p1.next!=null)
			{
				p1=p1.next.next;
			}	
			if(p2.next!=null)
			{
				p2=p2.next;
			}
			if(p1!=null && p2!=null && p1.equals(p2))
			{
				break;
			}
		}
		if(p1==null || p2==null)
		{
			return false;
		}
		return true;
	}
}
