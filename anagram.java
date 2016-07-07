/*
 * Check if the given strings are anagrams.
 * mam==mam--->yes
 * abc==bac==cab==cba==bca==acb--->anagrams
 * same letters.any order
 */
import java.util.Scanner;

/**
 * @author dny
 *
 */
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your strings:");
    Scanner sc= new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    int matches=0;
    String s11=s1.replaceAll("\\s", "");
	String s22=s2.replaceAll("\\s", "");
    if(s11.length()==s22.length())
    {
    	
    	
    	System.out.println("s11:"+s11);
    	System.out.println("s22:"+s22);
    	
    	char[] c1=s11.toCharArray();
    	char[] c2=s22.toCharArray();
    	/*
    	for(int k=0;k<c1.length;k++)
    	{
    	System.out.println("c1:"+c1[k]);
    	}
    	for(int m=0;m<c2.length;m++)
    	{
    	System.out.println("c2:"+c2[m]);
    	}
    	*/
    	
    	for(int i=0;i<c1.length;i++)
    	{
    		char ch=c1[i];
    		//System.out.println("***ch::"+ch);
    		for(int j=0;j<c2.length;j++)
    		{
    		//	System.out.println("c2[j]******:"+c2[j]);
    			if(ch==c2[j])
    			{
    				matches++;
    			//	System.out.println("matches:"+matches);
    			}
    		}  		
    	}
    	if(matches>=c1.length)
    	{
    		System.out.println("Anagrams.");
    	}
    	else
    	{
    		System.out.println("Nooooooooooooooo no onononon nonono nonon nononn ");
    	}
    	
    }
    else
    {
    	System.out.println("Nooooo");
    }
	}

}
