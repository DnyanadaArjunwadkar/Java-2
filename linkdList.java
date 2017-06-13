package linkedList;

public class linkdList {

	static Node head;

	int size=0;
	class Node
	{
		int data;
		Node next;
		public Node(int d)
		{
			this.data=d;
		}
	}
	//add node
	public void appendNode(int x)
	{
		Node n= new Node(x);
		if(head==null)
		{ 
			
			head=n;
			size++;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			size++;
		}
	}
	//insert node at position
	public void nodeInsert(int x,int position)
	{
		Node nn=new Node(x);
		if(head==null)
			appendNode(x);
		int target=0;
		Node temp=head;
		while( temp.next!=null)
		{
			if(target==position)
				break;
			temp=temp.next;
			target++;			
		}
		nn.next=temp.next;
		temp.next=nn;
		size++;
	}
	//Delete by index
	public void nodeDeleteByIndex(int position)
	{
		if(head==null)
			return;

		if(position>size)
		{
			System.out.println("");
			pf("your position is greater than the size of LL");
		}
		Node temp=head;
		int count=-1;
		while(temp.next!=null)
		{
			if(count+1==position)
			{
				temp.next=temp.next.next;
				System.out.println("");
				System.out.println("Just deleted node with index:"+position);
				
				break;
			}
			count++;
			temp=temp.next;
				
		}		
	}
	//Delete node by val
	public void nodeDeleteByVal(int val)
	{
		if(head==null)
			return;		
		Node n= head;
		Node prev = null;
		while(n.next!=null)
		{
			if(n.data==val)
			{
				prev.next=n.next;
				pf("Deleted Node with value :"+val+" Succesfully!");
				break;
			}		
			prev=n;
			n=n.next;
		}
	}
	//print LL
	public void printLL()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+"->");
			n=n.next;			
		}
	}
	// remove duplicates from unsroted list
	void remDup2(linkdList ll)
	{
		Node n=head;
		while(n!=null)
		{
			Node temp=n;
			
			while(temp.next!=null)
			{
				if(temp.next.data==n.data)
				{
					temp.next=temp.next.next;
				}
				else
				{
					temp=temp.next;
				}
			}
			n=n.next;
		}
	}
	//middle element of LL without knowing size
	public int midLL(linkdList ll)
	{
		Node p1=head;
		Node p2=head;
		while(p2.next!=null )
		{
			System.out.println("p1:"+p1.data);
			System.out.println("p2:"+p2.data);
			
			if(p2.next.next!=null)
				p2=p2.next.next;	
			else
				break;
			p1=p1.next;
		}
		return p1.data;

	}
	private int kthLargest(int k) 
	{		
		Node n=head;
		int len=1;
		while(n.next!=null)
		{
			n=n.next;
			len++;
		}

		if(k==len)
			return head.data;
		Node p1=head;
		Node p2=head;		
		while(k!=0)
		{
			k--;
			p2=p2.next;		
		}	
		while(p2.next!=null)
		{
		p2=p2.next;
		p1=p1.next;
		}
		
		if(p1.next!=null)
			return p1.next.data;
		else
			return p1.data;
	}
	
	//deleteing node when you are given access to only that node.
	
	public void deleteNode(Node n)
	{
		
		if(n==null || n.next==null)
		{
			return;
		}
		Node temp=n.next;
		n.data=temp.data;
		n.next=temp.next;
	}
	public static void main(String[] args) 
	{
		linkdList ll= new linkdList();
		/*
		ll.appendNode(1);
		ll.appendNode(3);
		ll.appendNode(1);
		ll.appendNode(1);
		ll.appendNode(3);
		ll.appendNode(4);
		ll.appendNode(1);
		ll.appendNode(5);
		*/
		ll.appendNode(11);
		ll.appendNode(2);
		ll.appendNode(32);
		ll.appendNode(4);
		ll.appendNode(1);
		ll.appendNode(13);
		ll.appendNode(21);
		ll.appendNode(3);
	

		ll.pf("before:");
		ll.printLL();
		System.out.println("");
		
		/*
		
		
		ll.remDup2(ll);
		ll.nodeDeleteByVal(14);
		ll.nodeDeleteByIndex(0);
		ll.deleteNode(head);
		ll.pf("after:");
		ll.printLL();	
		System.out.println("kth answe:"+ll.kthLargest(7));
		System.out.println("k th Largest:"+ll.midLL(ll));
	
		*/
		//pf("reverse oreder :");
		//ll.printReverse(ll.head);
		System.out.println("Len uisng recurison:");
		ll.lenthRecursion(ll.head);		
	}

	private int lenthRecursion(Node head2) 
	{
		int len=0;
		if(head2==null)
		{
			return 0;
		}
		else
		{
			len=1+lenthRecursion(head2.next);
			System.out.println("len :"+len);
			return len;
		}		
	}
	
	//print LL in reverse order using recursion
	private void printReverse(Node head2) 
	{
		if(head2==null)
			return;
		printReverse(head2.next);
		System.out.println(head2.data);	
	}
	public static void pf(String msg)
	{
		System.out.println(msg);
	}
}
