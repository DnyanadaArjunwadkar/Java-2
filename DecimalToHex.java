import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DecimalToHex {
    public static String toHex(int num) 
    {
    	StringBuilder sb= new StringBuilder();
    	HashMap<Integer,Character> hm= new HashMap<Integer,Character>();
    	hm.put(10, 'a');
    	hm.put(11, 'b');
    	hm.put(12, 'c');
    	hm.put(13, 'd');
    	hm.put(14, 'e');
    	hm.put(15, 'f');   	
    	int n=num;
    	int rem=0;
        while(n>0)
        {
        	rem=n%16;
        	n=n/16;
        	if(rem>9)
        	{
        		sb.insert(0,hm.get(rem));
        	}
        	else
        	{
        		sb.insert(0, rem);       		
        	}        	
        } 
        
        if(n<0)
        {      	
        	return twosComplement(n);     	
        }       
        return sb.toString();
    }
	
	private static String twosComplement(int n) 
	{		
		
		/**
		 1.take positive value of that nunmber
		 2.take 2's complement.->2's complement is nothing but
		    1's complement + 1;
		 3.group into 4 digits and this binary to decimal.
		 4.now decimal to HEX
		 
		 */
		int num=n*-1;
		String bin=Integer.toBinaryString(num);
		System.out.println("binary version:"+bin);
		String given=String.format("%32s", Integer.toBinaryString(num));
		given=given.replaceAll("\\s","0");
		System.out.println("given :"+given);
		given=given.replaceAll("1", "8");
		given=given.replaceAll("0", "1");
		given=given.replaceAll("8", "0");
		System.out.println("1's complement :"+given);
		System.out.println("1's complement OR 1 you will get:2's complement as follows :");
		
		int flag=1;
		StringBuilder sb3= new StringBuilder();
		for(int i=given.length()-1;i>=0;i--)
		{
			if(given.charAt(i)=='1' && flag==1)
			{
				sb3.insert(0,0);
				flag=1;
			}
			else if(given.charAt(i)=='0' && flag==1)
			{
				sb3.insert(0,1);
				flag=0;				
			}
			else if(given.charAt(i)=='1' && flag==0)
			{
				sb3.insert(0,1);
				flag=0;			
			}
			else if(given.charAt(i)=='0' && flag==0)
			{
				sb3.insert(0,0);
				flag=0;				
			}
		}
		System.out.println("2's Complement :"+sb3.toString());

		String toHex=sb3.toString();
		/*
		int i=0;
		int multiply=31;
		int grand=0;
		while(i<toHex.length())
		{
			int group=0;	
			int sum=0;
			while(group<4)
			{
				String digit=String.valueOf(toHex.charAt(i));
				int temp= Integer.parseInt(digit);
//				System.out.println("temp:"+temp);
				if(toHex.charAt(0)=='1' && i==0)
				{
				int temp2=(int) (-1*temp*Math.pow(2, multiply));
//				System.out.println("temp2:"+temp2);
				sum=sum+temp2;
				}
				else
				{
					int temp2=(int) (temp*Math.pow(2, multiply));
			//		System.out.println("temp2:"+temp2);
					sum=sum+temp2;
				}
				
				//System.out.println("sum :"+sum);				
				//System.out.println("i:"+i+": multiply :"+multiply+": sum :"+sum);
				group++;
				i++;
				multiply--;				
			}
			grand=grand+sum;
			//System.out.println("Grand:"+grand);
     		System.out.println("sb4 :"+sb4.toString()+": length :"+sb4.toString().length());			
		}
	
		System.out.println("Grand:"+grand);
		*/	
		int i1=0;
		ArrayList<Integer> al= new ArrayList<Integer>();
		while(i1<toHex.length())
		{
			int sum2=0;
			int pow=3;
			for(int j=0;j<4;j++)
			{
				String digit=String.valueOf(toHex.charAt(i1));
				int temp= Integer.parseInt(digit);
				int temp2=(int) (temp*Math.pow(2, pow));
				sum2=sum2+temp2;
				pow--;		
				i1++;
			}			
		
			al.add(sum2);
		}
	HashMap<Integer,Character> hm= new HashMap<Integer,Character>();
	hm.put(10, 'a');
	hm.put(11, 'b');
	hm.put(12, 'c');
	hm.put(13, 'd');
	hm.put(14, 'e');
	hm.put(15, 'f');   		
	StringBuilder sb4= new StringBuilder();
	for(int i11=0;i11<al.size();i11++)
	{
		int number=al.get(i11);
		if(number>9)
		{
		    sb4.append(hm.get(number));
		}
		else
		{
			sb4.append(number);
		}
	}
	String result=sb4.toString();
		return result;		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(toHex(1000));
		
    	//System.out.println("twos: complement :"+twosComplement(-23));
	}
}
