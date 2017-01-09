package blog;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber {	
	public static int[] singleNumber(int[] nums) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		if(nums.length==1)
		{
			return nums;
		}
		else
		{
		Arrays.sort(nums);
		//System.out.println(Arrays.toString(nums));
		int p1=0;
	  //  System.out.println("nums.length-1:"+(nums.length-1));
		while(p1<nums.length-1)
		{
			int p2=p1+1;
		//	System.out.println("p1:"+p1+": p2 :"+p2);
			if(nums[p1]==nums[p2])
			{ 
				p1=p2+1;
			}
			else
			{
				al.add(nums[p1]);
				p1++;
			}	
			
		}
	//	System.out.println("p1:"+p1);
		if(p1==nums.length-1)
		{
			al.add(nums[p1]);
		}
		else
		{
		//return null;  
		}
		if(al.size()!=0)
		{
			int[] res= new int[2];
			res[0]=al.get(0);
			res[1]=al.get(1);
			return res;
		}
		else
			return null; 
		
		}
    }
	
	
	
	public static void main(String[] args) {
		int[] arr={2,2,1,1,5,3};
		System.out.println(Arrays.toString(singleNumber(arr)));
		
		
	}

}
