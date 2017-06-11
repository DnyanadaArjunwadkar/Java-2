import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Braces {

	public static void main(String[] args) {
		System.out.println("enter N:");
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		if(N<1 || N>15)
		{
			System.out.println("Error N");		
		}
		String[] carr= new String[N];
		for(int i=0;i<N;i++)
		{
			System.out.println("print I:"+i);
			carr[i]=sc.next();	
			if(carr[i].length()<1 || carr[i].length()>100)
			{
				return;
			}
			System.out.println(balence(carr[i]));
		}
		System.out.println(Arrays.toString(carr));
	}

	private static String balence(String str) 
	{
		if(str.length()%2!=0)
		{
			return "No";
		}
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		hm.put(')', '(');
		hm.put('}', '{');
		hm.put(']', '[');
		Stack<Character> st= new Stack<Character>();
		boolean stackUsed=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i)=='['||str.charAt(i)=='{')
			{
				st.push(str.charAt(i));
				stackUsed=true;
			}
			if(str.charAt(i)==')' || str.charAt(i)==']'||str.charAt(i)=='}')
			{
				if(st.isEmpty())
				{
					return "No";
				}
				if(!st.isEmpty())
				{
					char ch=st.pop();
					if(ch!=hm.get(str.charAt(i)))
					{
						return "No";
					}
				}
			}
		}
		
		if(!st.isEmpty())
			return "No";
		
		if(!stackUsed)
		{
			System.out.println("never used");
			Pattern p=Pattern.compile("[a-zA-Z)-9]*$");
			Matcher m=p.matcher(str);
			if(m.matches())
			{
				return "No:::--->"+str;
			}
		}
		return "Yes";
	}

}
