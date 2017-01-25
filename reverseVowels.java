import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class reverseVowels {
	 public static String reverseVowels2(String s) 
	 {
		 Stack<Character> st= new Stack<Character>();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					st.push(s.charAt(i));
				}
				if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				{
					st.push(s.charAt(i));
				}
			}
			StringBuilder sb= new StringBuilder();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					if(!st.isEmpty())
					{
						Character ch=st.pop();
						sb.append(ch);						
					}
				}
				else if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				{
					if(!st.isEmpty())
					{
						Character ch=st.pop();
						sb.append(ch);						
					}
				}
				else
				{
					sb.append(s.charAt(i));
				}
			}		
		 return sb.toString();
	 }
	
	public static void main(String[] args) 
	{
	System.out.println(reverseVowels2("aA"));
    
	}

}
