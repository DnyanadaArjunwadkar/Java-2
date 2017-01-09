package blog;
/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), 
 * some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]
Output:
[2,3]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumbers {
	 public static List<Integer> findDuplicates(int[] nums) 
	    {
	        List<Integer> al= new ArrayList<Integer>();
	        Arrays.sort(nums);
	        System.out.println(Arrays.toString(nums));
	        int p1=0;
	        
	        while(p1<=nums.length-2)
	        {
	        	int p2=p1+1;
	        	if(nums[p1]==nums[p2])
	        	{
	        		al.add(nums[p1]);	
	        		p1=p2+1;
	        	}
	        	else
	        	{
	        		p1=p2;
	        	}	        	
	        }	        
	        return al;
	        
	    }
	public static void main(String[] args) {
		
		int [] arr={4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(arr));
    
	}

}
