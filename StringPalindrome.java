package blog;

import java.util.Arrays;
import java.util.Collections;

public class StringPalindrome {

	public static boolean isPalindrome1(String s)
	{
		String given=s;
		char[] charArray= s.toCharArray();
		StringBuilder sb= new StringBuilder();		
		for(int i=charArray.length-1;i>=0;i--)
		{
			sb.append(charArray[i]);
		}
		String s2=sb.toString();
		System.out.println(s2);
		if(s.equals(s2))
			return true;
		return false;		
	}
	public static boolean isPalindrome2(String s)
	{
		//following can be broken down as follows:
		/*
		StringBuilder sb2= new StringBuilder();
		sb2.append(s);
		sb2.reverse();	
		String s2=sb2.toString();
		System.out.println("Your reversed string is :"+s2);
		if(s.equals(s2))
			return true;
		else
			return false;
		*/
		return (s.equals(new StringBuilder().append(s).reverse().toString()));
	}
	public static boolean isPalindrome3(String s)
	{
		s=s.replaceAll("[^a-zA-Z]", "");//remove special char like quotes and commas
		s=s.toLowerCase();//this is given string
		System.out.println("s:"+s);
		String s1=s.replaceAll("[^a-zA-Z]", "");//remove special char like quotes and commas
		s1=s1.toLowerCase();
		System.out.println("s1:"+s1);
		//s1 will be reveresed by creating StringBuilder Object as follows.
		//this s1 is compared with s	
		return (s.equals(new StringBuilder().append(s1).reverse().toString()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";		
		System.out.println("method 1:"+isPalindrome1(s));
		System.out.println("method 2:"+isPalindrome2(s));
		String s2="Madam, I'm Adam";
		System.out.println("method 2:"+isPalindrome3(s2));
		String s3="324";
		System.out.println("method 1:"+isPalindrome1(s3));
		System.out.println("method 2:"+isPalindrome2(s3));
		System.out.println("method 2:"+isPalindrome3(s3));
		String s4="-77";
		System.out.println("method 1:"+isPalindrome1(s4));
		System.out.println("method 2:"+isPalindrome2(s4));
		System.out.println("method 2:"+isPalindrome3(s4));
	}

}
