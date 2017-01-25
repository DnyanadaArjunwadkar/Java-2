import java.util.HashMap;
import java.util.Stack;

public class balanceParanthesis {
    public static boolean isValid(String s) 
    {
    	
    	if(s.length()==1)
    	{
    		return false;
    	}
    	
    	HashMap<Character,Character> hm = new HashMap<Character,Character>();
    	hm.put( ')','(');
    	hm.put(']','[');
    	hm.put('}','{');
    	
		Stack<Character> st= new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			Character ch= s.charAt(i);		
			if(ch=='(' || ch=='[' ||ch=='{')
			{
				st.push(ch);
			}	
			if(ch==')' || ch==']' ||ch=='}')
			{
				if(!st.isEmpty())
				{
					Character poppedCh=st.pop();
					Character hmCh=hm.get(ch);
					if(hmCh!=poppedCh)
					{
						return false;
					}				
				}
				else
				{
					return false;
				}
			}			
		}
  	 if(st.isEmpty())
  	 {
    	return true;
  	 }
  	 else
  		 return false;
        
    }
	public static void main(String[] args) 
	{
		System.out.println(isValid("(("));
	}

}
