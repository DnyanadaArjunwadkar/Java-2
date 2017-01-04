package blog;
////Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution.
		
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

public static int[] twoSum(int[] numbers, int target) 
{
	int[] ans=new int[2];
	HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
	for(int i=0;i<numbers.length;i++)
	{		
		int diff=target-numbers[i];
		if(hm.containsKey(diff))
		{
			ans[0]=hm.get(diff);
			ans[1]=i;
		}
		hm.put(numbers[i], i);		
	}
	return ans;      
}
	public static void main(String[] args) 
	 {
		int[] arr={2,3,5,7};
		int[] ans=twoSum(arr,5);
		System.out.println(Arrays.toString(ans));		
	}

}
