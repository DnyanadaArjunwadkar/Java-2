package linkedList;

import java.util.HashMap;
import java.util.Stack;

public class linkdList {

	 Node head;

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
	public static void printLL(Node n2)
	{
		Node n=n2;
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
	//print kth largest
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
	
	
	//deleting last occurance of node
	
	private void deleteLastOccrance(int i) 
	{
	  Node n=head;	  
	  Node prev=null;
	  while(n!=null)
	  {
		  if(n.next!=null && n.next.data==i )
		  {
			  prev=n;
		  }
		  n=n.next;	  
	  }
	  prev.next=prev.next.next;		
	}
	
	public static void main(String[] args) 
	{
		linkdList ll= new linkdList();
		linkdList ll2= new linkdList();
		
		ll.appendNode(7);
		ll.appendNode(1);	
		ll.appendNode(5);
		ll.appendNode(13);
		ll.appendNode(70);
		ll.appendNode(31);
		ll.appendNode(42);
		deletAlternateNode(ll);
		
		//interSection(ll,ll2);
		//union(ll,ll2);
		//add(ll,ll2);
		
		
		//System.out.println(ll.isPalindrome());
		
	
		//ll.printLL(ll.rev(head));
		//ll.palli2();
		/*
		ll.printLL();
		
		ll.remDup2(ll);
		ll.nodeDeleteByVal(14);
		ll.nodeDeleteByIndex(0);
		ll.deleteNode(head);
		ll.deleteLastOccrance(32);
		ll.pf("after:");
		ll.printLL();	
		System.out.println("kth answe:"+ll.kthLargest(7));
		System.out.println("k th Largest:"+ll.midLL(ll));	
		*/
		//pf("reverse oreder :");
		//ll.printReverse(ll.head);
		//System.out.println("Len uisng recurison:");
		//ll.lenthRecursion(ll.head);		
	}
	private static void deletAlternateNode(linkdList ll) 
	{
		Node h1=ll.head;
		while( h1.next!=null && h1.next.next!=null)
		{
			System.out.println("before :"+h1.data);
			{
			h1.next=h1.next.next;
			h1=h1.next;
			}			
			System.out.println("after new :"+h1.data);
		}
		
		System.out.println();
		pf("after deleting :");
		printLL(ll.head);
		
	}
	
	//add number stored in a LL
	private static void add(linkdList ll, linkdList ll2)
	{
		int carry=0;
		Node h1=ll.head;
		Node h2=ll2.head;
		if(ll.size>ll2.size)
		{
			int z=ll.size-ll2.size;
			for(int i=0;i<z;i++)
			{
				ll2.nodeInsert(0, ll2.size+1);
			}
		}
		System.out.println("");
		pf("printing ll2 after adding zeros");
		ll2.printLL(ll2.head);
		if(ll2.size>ll.size)
		{
			int z=ll2.size-ll.size;
			for(int i=0;i<z;i++)
			{
				ll.nodeInsert(0, ll.size+1);
			}
		}
		System.out.println("");
		pf("printing ll after adding zeros");
		
		ll.printLL(ll.head);
		linkdList ans= new linkdList();
		while(h1!=null && h2!=null)
		{
			int res= h1.data+h2.data+carry;
			if(res>9)
			{
				carry=res/10;
				res=res%10;
			}
			pf("carry :"+carry);

			ans.appendNode(res);
			h1=h1.next;
			h2=h2.next;
		}
		pf("printing answer zeros");
		System.out.println("");
		ll.printLL(ans.head);
		
	}
	private static void union(linkdList ll, linkdList ll2) 
	{
		 linkdList uni= new linkdList();
		 Node h1=ll.head;
		 Node h2=ll2.head;
		 linkdList ans= new linkdList();
		 while(h1!=null && h2!=null)
		 {		 
			 if(h1.data<h2.data)
			 {
				 uni.appendNode(h1.data);
				 h1=h1.next;
				
			 }
			 else if(h1.data>h2.data)
			 {
				 uni.appendNode(h2.data);
				 h2=h2.next;
			 }
			 else
			 {	
				 uni.appendNode(h1.data);
				 h1=h1.next;
				 h2=h2.next;
			 }
		 }
		 if(h1!=null)
		 {
			 while(h1!=null)
			 {
				 uni.appendNode(h1.data);
				 h1=h1.next;
			 }
		 }
		 if(h2!=null)
		 {
			 while(h2!=null)
			 {
				 uni.appendNode(h2.data);
				 h2=h2.next;
			 }
		 }
		 System.out.println("");
		 System.out.println("Union is as follows:");
		 
		 Node h3=uni.head;
		 while(h3!=null)
		 {
			 System.out.print("->"+h3.data);
			 h3=h3.next;
		 }
		 
	}
	//intersection of 2 linkedLists
private static void interSection(linkdList ll, linkdList ll2) 
	{
	 Node h1=ll.head;
	 Node h2=ll2.head;
	 linkdList ans= new linkdList();
	 while(h1!=null && h2!=null)
	 {		 
		 if(h1.data<h2.data)
		 {
			 h1=h1.next;
		 }
		 else if(h1.data>h2.data)
		 {
			 h2=h2.next;
		 }
		 else
		 {	
			 ans.appendNode(h1.data);
			 h1=h1.next;
			 h2=h2.next;
		 }
	 }
		
	 System.out.println("Intersection is as follows:");
	 
	 Node h3=ans.head;
	 while(h3!=null)
	 {
		 System.out.print("->"+h3.data);
		 h3=h3.next;
	 }
	 
	 
	 
	}
//LinkedList pallindrome using stack
	private boolean isPalindrome()
	{
		Node n=head;
		Stack<Integer>st= new Stack<Integer>();
		while(n!=null)
		{
			st.push(n.data);
			n=n.next;
		}

		n=head;
		while(n.next!=null)
		{
			int item=st.pop();
			if(item!=n.data)
				return false;
			n=n.next;
		}				
		return true;		
	}
	
	public void palli2()
	{
		Node fs=head;
		Node sl=head;
		while(fs!=null && fs.next!=null)
		{
			fs=fs.next.next;
			sl=sl.next;
		}
		System.out.println(fs.data);
		System.out.println(sl.data);		
		
		System.out.println("caliling reveresed list");
		printLL(rev(sl.next));
	
		
	}
	
	public Node rev(Node n)
	{
		Node curr=n;
		Node n1=null;
		Node prev=null;
		while(curr!=null)
		{
			n1=curr.next;
			curr.next=prev;
			prev=curr;
			curr=n1;
		}
		n=prev;
		
		return n;		
	}
	
	//length of LL using recursion
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
