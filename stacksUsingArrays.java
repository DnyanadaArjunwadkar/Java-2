
public class stacksUsingArrays 
{
	private int[] stack;
	private int p1=0;
	public stacksUsingArrays(int cap)
	{
		stack=new int[cap];
	}
	public stacksUsingArrays()
	{
		stack=new int[4];
	}
	public boolean isEmpty()
	{
		if(p1==0)
			return true;
		else
			return false;
	}
	public int peek()
	{
		if(!isEmpty())
		{
			return stack[0];
		}
		else
		{
			System.out.println("empty stack. nothing to peek");
			return -1;
		}
	}
	public void pushItem(int d)
	{
		if(p1==stack.length)
		{
			System.out.println("Stack is full. Resizing array");
			resize(p1*2);
		}
		
		stack[p1]=d;
		p1++;

	}
	public int popItem()
	{
		if(isEmpty())
			return -1;
		int ans=stack[p1-1];
		stack[p1-1]=0;
		p1--;
		return ans;
	}
	public void printStack()
	{
		for(int i=p1-1;i>=0;i--)
		{
			System.out.print(stack[i]+"->");
		}
	}
	
	private void resize(int i) 
	{
		int [] temp= new int[i];
				for(int i1=0;i1<stack.length;i1++)
				{
					temp[i1]=stack[i1];
				}
		stack=temp;
		System.out.println("Stack has been resized");
	}
	public static void main(String[] args) 
	{
		stacksUsingArrays st= new stacksUsingArrays(8);
		st.pushItem(1);
		st.pushItem(2);
		st.pushItem(3);
		st.printStack();
		System.out.println("popped:"+st.popItem());
		st.printStack();
		

	}

}
