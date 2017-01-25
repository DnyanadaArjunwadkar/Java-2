import java.util.Stack;
/**
 Given an input string, reverse the string word by word.
For example,
Given s = "the sky is blue",
return "blue is sky the".
 */
public class reverseStringWords {

	
	
	public static String reverseWords(String s)
   {
		s=s.trim();
		//System.out.println(s);
    Stack<String> st= new Stack<String>();
	String[] sArray= s.split("\\s");
	System.out.println("size:"+sArray.length);
	for(int i=0;i<sArray.length;i++)
	{
		//System.out.println("char is :"+sArray+":<----  dny:");
		String element=sArray[i];	
		element=element.trim();
		if(element.matches(".*\\w.*"))
		{
		st.push(element);
		}
	}
	StringBuilder sb= new StringBuilder();
	while(!st.isEmpty())
	{
		sb.append(st.pop());
		sb.append(" ");
	}	
	String result=sb.toString().trim();
	
	return result;	
	}
	
	public static void main(String[] args)
	{
    System.out.println(reverseWords("   a   b "));

	}

}
