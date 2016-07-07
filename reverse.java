/*
 * Reverse a given String.
 */
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("enter a string:");
		 Scanner sc= new Scanner(System.in);
		    String s1=sc.nextLine();
		    String s11=s1.replaceAll("\\s", "");
 
		    char[] c1=s1.toCharArray();
		    char[] c2=new char[c1.length];
		   
		   // System.out.print("__"+c1.length);	
		   // System.out.print("\n");	
	    	int l=c1.length;
	    	int j=0;
		    for(int i=l;i>0;i--)
		    {
		    	//System.out.print("__"+c1[i-1]);	
		    	//System.out.print("\n");	
		    	c2[j]=c1[i-1];
		    	j++;
		    }
		    for(int m=0;m<c2.length;m++)
	    	{
	    	//System.out.println("c2:"+c2[m]);
	    	}
		    String str2=String.valueOf(c2);
			System.out.println("Reversed:"+str2);
	}

}
