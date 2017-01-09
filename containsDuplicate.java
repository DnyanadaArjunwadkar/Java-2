package blog;
//Given an array of integers, find if the array contains any duplicates. 
//Your function should return true if any value appears at least twice in the array,
//and it should return false if every element is distinct.
import java.util.HashSet;

public class containsDuplicate {

	public static  boolean containsDuplicate(int[] nums) 
	{
		
		HashSet<Integer> hs= new HashSet<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			Integer i2=new Integer(nums[i]);
			hs.add(i2);
		}
		if(hs.size()==nums.length)
		{
			return false;
		}
		else
		{
		  return true;
		}
    }
	public static void main(String[] args) 
	{	
		int[] arr={1,1,2,2,3,3};
		int[] arr2={1,2,3};
		System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicate(arr2));
		
	}

}
