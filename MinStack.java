import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
//This is Stack using LinkedHashMap
public class MinStack 
{
 LinkedHashMap<Integer,Integer> hm= new LinkedHashMap<Integer,Integer>();

    /** initialize your data structure here. */
    public MinStack() 
    {
        hm.clear();
        System.out.println("Stack Initialized");
    }
    
    public void push(int x) 
    {
        hm.put(x, 1);
        System.out.println("item:"+x+": Pushed successfully.");
    }
    
    public void pop() 
    {
    	if(hm.size()==0)
    		System.out.println("Stack Empty Already");
    	else
    	{
    		int stop=0;
    		for(Map.Entry<Integer,Integer>e: hm.entrySet())
    		{
    			if(stop==hm.size()-1)
    			{
    			 	System.out.println("Popped Item :"+e.getKey());
    			 	hm.remove(e.getKey());
    			}
    			stop++;
    		}
    	}
    }
    
    public int top() 
    {
        if(hm.size()!=0)
        {
        	int stop=0;
    		for(Map.Entry<Integer,Integer>e: hm.entrySet())
    		{
    			if(stop==hm.size()-1)
    			{
    				System.out.println("TOP of the Stack Item :"+e.getKey());
    			    return e.getKey();
    			}
    			stop++;
    		}
        }
		return -1;
    }
    
    public int getMin() 
    {
    	System.out.println("Minimum of the Stack :"+Collections.min(hm.keySet()));
        return Collections.min(hm.keySet());
    }
    public static void main(String[] args) 
	{    	
    	MinStack minStack = new MinStack();
    	minStack.push(-2);
    	minStack.push(0);
    	minStack.push(-3);
    	minStack.getMin();  // --> Returns -3.
    	minStack.pop();
    	minStack.top();      //--> Returns 0.
    	minStack.getMin();   //--> Returns -2.	
	}
    
//Stack using LinkedList
 /*
  class MinStack {
    private Node head;
    
    public void push(int x) {
        if(head == null) 
            head = new Node(x, x);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
    
    private class Node {
        int val;
        int min;
        Node next;
        
        private Node(int val, int min) {
            this(val, min, null);
        }
        
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
   
   
   
  */  

}
