package blog;

public class ReverseInteger {

	public static int reverse(int x) 
    {
		int sum=0;
	    int r=0;
	    int n=x;
		if(x<0)
		{
			x=x*-1;	  
			n=x;
	        while(Math.abs(sum)>0)
	        {
	        	if(Math.abs(sum)>Integer.MAX_VALUE/10)
	        		return 0;
	            r=n%10;
	            sum=sum*10+r;
	            n=n/10;
	        }
	        return -sum;
		}
		else
		{
	        while(Math.abs(n)>0)
	        {
	        	if(Math.abs(sum)>Integer.MAX_VALUE/10)
	        		return 0;
	            r=n%10;
	            sum=sum*10+r;
	            n=n/10;
	        }  	
	        return sum;
		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println(reverse(-123));
	}

}
