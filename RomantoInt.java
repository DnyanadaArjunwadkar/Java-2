package blog;

import java.util.HashMap;
import java.util.HashSet;

public class RomantoInt {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(RomanToInt("MCCCXIX"));
	}
	private static int RomanToInt(String string) 
	{
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		int sum=0;
		int flag_last=0;
		//this hm has special subtraction cases;
		hm.put("IV", 4);
		hm.put("IX", 9);
		hm.put("XL", 40);
		hm.put("XC", 90);
		hm.put("CD", 400);
		hm.put("CM", 900);
		String s=string;
		HashSet<Character> hs= new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		if(hs.size()==1 && s.length()>3)
		{
			System.out.println("Same letter can not be repeated more than 3 times.");
			return 0;
		}		
		if(s.length()==1)
		{
			sum=sum+CharToVal(s.charAt(0));			
		}
		else
		{		
			int p1=0;
			int p2=0;
			while(p1<s.length() && p2<s.length())
			{
				p2=p1+1;
				StringBuilder sb= new StringBuilder();
				sb.append(s.charAt(p1));
				  if(p2<s.length())
					{
					  sb.append(s.charAt(p2));
					}
				  if(hm.containsKey(sb.toString()))
					{
						sum=sum+hm.get(sb.toString());
						p1=p1+2;
					}
				  else
					{
						sum=sum+CharToVal(s.charAt(p1));			
						p1=p1+1;
					}			
			}
				if(flag_last!=0)
				{
					sum=sum+CharToVal(s.charAt(flag_last));
				}					
		}
		return sum;
	}

	private static int CharToVal(char c) 
	{
		if(c=='I')
			return 1;
		if(c=='V')
			return 5;
		if(c=='X')
			return 10;
		if(c=='L')
			return 50;
		if(c=='C')
			return 100;
		if(c=='D')
			return 500;
		if(c=='M')
			return 1000;
		return 0;
	}
}
