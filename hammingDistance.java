package blog;
/**
 * The Hamming distance between two integers is the number of positions at which
 *  the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:
Input: x = 1, y = 4
Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
*/
import java.util.ArrayList;
import java.util.Collections;

public class hammingDistance {

public static int hammingDistance(int x, int y) 
    {
	    int dist=0;
	    String s1=Integer.toBinaryString(x);
	    String s2=Integer.toBinaryString(y);
	    int zeros=0;
	    
	    if(s1.length()>s2.length())
	    {
	    	zeros=s1.length()-s2.length();
	    	StringBuilder sb= new StringBuilder();
	    	for(int i=0;i<zeros;i++)
	    	{
	    	sb.insert(0,0);
	    	}
	    	sb.append(s2);
	    	s2=sb.toString();
	    	
	    }
	    if(s2.length()>s1.length())
	    {
	    	zeros=s2.length()-s1.length();
	    	StringBuilder sb= new StringBuilder();
	    	for(int i=0;i<zeros;i++)
	    	{
	    	sb.insert(0,0);
	    	}
	    	sb.append(s1);
	    	s1=sb.toString();
	    }
	    if(s1.length()==s2.length())
	    {
	    	for(int i=0;i<s1.length();i++)
	    	{
	    		if(s1.charAt(i)==s2.charAt(i))
	    		{
	    			
	    		}
	    		else
	    		{
	    			dist++;
	    		}
	    	}
	    }
	    
		return dist;
        
    }
	
	
	public static void main(String[] args) {
		System.out.println(hammingDistance(1,4));
	}

}
