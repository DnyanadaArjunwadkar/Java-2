import java.util.Arrays;

public class CountingBits {

	public static int[] countBits(int num) 
	{
		int[] result= new int[num+1];
		
		if(num==0)
		{
			int[] result1= new int[1];
			return result;	
		}
			
		if(num==1)
		{ 
			int[] result1= new int[2];
			result1[0]=0;
		    result[1]=1;
		    return result;
		}
		result[0]=0;
		result[1]=1;
		for(int i=2;i<num+1;i++)
		{
			int num_ones=0;
			int n=i;
			while(n>0)
			{
				int rem=n%2;
				n=n/2;
				if(rem==1)
				{
					num_ones++;
				}				
			}
		//	System.out.println("nums_ones :"+num_ones);
			result[i]=num_ones;				
		}		
		//System.out.println("result :"+Arrays.toString(result));
		return result;        
    }
	public static void main(String[] args)
	{
		System.out.println("helo");
		System.out.println(Arrays.toString(countBits(0)));

	}

}
