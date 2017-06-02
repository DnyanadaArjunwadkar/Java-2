

import java.util.BitSet;

public class ArrayMissingNum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a={0,1,3,4,5,6,7,8};
		//this should be a sorted array of positive integers
		//a[0] will take care of offset
		//can identify multiple missing numbers if range is known		
		missingNums(a,(a.length+a[0]));
		//System.out.println("using XOR as follows:");
		missingUsingXor(a);
		//can identify one missing number when range is starting from 1
		
	}


	private static void missingNums(int[] a, int length) 
	{
		// TODO Auto-generated method stub
		BitSet bi=new BitSet();
		for(int i=0;i<a.length;i++)
		{
			bi.set(a[i]-a[0]);
		}	
		for(int i=0;i<a.length;i++)
		{
			if(!bi.get(i))
			{
				System.out.println("your missing number is: "+(i+a[0]));
			}		
		}	
	}
	private static void missingUsingXor(int[] a)
	{
		//works only for one missing number
	 int result=a[0];
	 for(int i=1;i<a.length;i++)
	 {
		 result=result ^ a[i];		 
	 }
	 System.out.println("result:"+result);
	 int min=a[0];
	 int max=a[a.length-1];
	 int result2=1;
	 for(int i=min+1;i<=max;i++)
	 {
		 result2=result2 ^ i;
	 }
	 System.out.println("result2:"+result2);
	}
}
