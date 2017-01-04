package blog;
/*
 * Implement atoi to convert a string to an integer.
 */
public class myAtoi {
	 public static int myAtoi(String str) 
	 {
		 boolean positive = true;
		 
		 if(str.length()==0 || str==null)
		 {
			 return 0;
		 }
		 str=str.trim();
		 str=str.replaceAll("\\s+","");
		 
		 int index=0;
		 if(str.length()==1 && Character.isDigit(str.charAt(0)))
		 {
			 positive=true;
			
		 }
		 else if(str.length()==1 && !Character.isDigit(str.charAt(0)))
		 {
			 return 0;
		 }
		 if(str.charAt(index)=='+')
		 {
			 positive=true;	
			 index++;
		 }
		  if(str.charAt(index)=='-')
		 {
			 positive=false;
			 index++;
		 }
	
		 int sum=0;
		 for(;index<str.length();index++)
		 {
			 //if(str.charAt(index)!='-')
			 {
					//int num=Integer.parseInt(String.valueOf(str.charAt(index)));
				 int num = str.charAt(index) - '0';  
					if(num<0 || num>9)
						break;
					if(positive)
					{
						sum=sum*10+num;
						if(sum>Integer.MAX_VALUE)
							return Integer.MAX_VALUE;
					}
					else
					{
						sum=sum*10-num;
						if(sum<Integer.MIN_VALUE)
							return Integer.MIN_VALUE;
					}					 
				 }			
			 }	
		return sum;
	    }
	public static void main(String[] args) 
	{
		
		System.out.println(myAtoi(" +2"));

	}

}
