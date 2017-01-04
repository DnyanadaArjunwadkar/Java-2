package blog;

public class IntegerPalindrome {
	 public static boolean isPalindrome(int x) 
	    { 
		 if(x<0)//negative number are not palidromes
		 {
			return false; 
		 }
		 else
		 {
			 int given=x;
			 int n=x;
			 int sum=0;
			 int r=0;
			 while(n>0)
			 {
				 r=n%10;
				 sum=sum*10+r;
				 n=n/10;
			 }
		  if(given==sum)
			  return true;
		  else
			  return false;
		 }		 
	    }
	public static void main(String[] args) 
	{		
	
		int i=2147447412;
		System.out.println(isPalindrome(i));
	}

}
