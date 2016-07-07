/*
 * Check if the string contains only Digits.
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("enter a string:");
		 Scanner sc= new Scanner(System.in);
		    String s1=sc.nextLine();
		    String s11=s1.replaceAll("\\s", "");
            int digits=0; 
		    char[] c1=s1.toCharArray();
		    for(int i=0;i<c1.length;i++)
		    {
		    	char ch=c1[i];
		    	int asc=(int) ch;
		    	//System.out.println(asc);
		    	if(asc>47 && asc<58)
		    	{
		    	digits++;
		    	// System.out.println("ONly numbers");
		    	}
		    }
		    if(digits==c1.length)
	    	{
	    		System.out.println("ALALALALAL Numbers********");
	    	}
	    	if(digits!=c1.length)
	    	{
	    		System.out.println("MMMMIIIIXXXXXEEEEDDDDD");
	    	}
	    	 System.out.print("enter a string:str2 :");
    String s3=sc.nextLine();
   // Pattern p=Pattern.compile(".*[^0-9].*");
  Pattern p=Pattern.compile("\\d");
    if(p.matcher(s3).matches())
    {
    	System.out.println("digit");
    }
    if(!p.matcher(s3).matches())
    {
    	
    	System.out.println("Letter");
    }
    
	}

}
