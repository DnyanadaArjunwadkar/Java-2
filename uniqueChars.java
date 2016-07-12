/*
 * determine if string has all unique chars:
 * CTCI edition 5 chapter 1:Arrays and Strings Question 1
 * O(n^2)
 */
import java.util.Scanner;

public class uniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your strings:");
	    Scanner sc= new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s11=s1.replaceAll("\\s", "");
	    char[] c1=s11.toCharArray();
	    char[] temp=new char[c1.length];
	    int unique=0;
	    int index=0;
	    int target=0;
	    for(int y=0;y<s11.length();y++)
	    {
	    	int val=s11.charAt(y);
	    	System.out.println("dnyanda----->:"+val);
	    	
	    }
	    for(int i=0;i<c1.length;i++)
	    {
	    	char ch=c1[i];
	    	temp[index]=c1[i];
	    	for(int j=i+1;j<c1.length;j++)
	    	{
	    		if(ch==c1[j])
	    		{
	    			target++;
	    		//	System.out.println("Duplicate detected. Not unique.target:"+target);
	    			break;
	    		}
	    		else
	    		{
	    			unique++;
	    			//System.out.println("Unique Char:"+c1[i]+": count :"+unique);
	    		//	System.out.println("Length of string :"+c1.length);
	    		}		
	    	}
	    }
	    
	    if(target==0)
	    {
	    	System.out.println("Unique!");
	    }
	    else
	    {
	    	System.out.println("Better Luck next time.");
	    }
	    
	}
}
