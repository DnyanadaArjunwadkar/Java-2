package blog;
/*
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the 
returned list does not count as extra space.

Example:
Input:
[4,3,2,7,8,2,3,1]
Output:
[5,6]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		
		List<Integer> al= new ArrayList<Integer>();
		List<Integer> res= new ArrayList<Integer>();
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		for(int i=1;i<=nums.length;i++)
		{		
			int ans=Arrays.binarySearch(nums, i);
		   
			if(ans<0)
			{
				res.add(i);
			}
		}		
		return res;       
    }
	public static void main(String[] args) 
	{
		int[] arr={4,3,2,7,7,2,3,1};
		System.out.println(findDisappearedNumbers(arr));

	}

}
