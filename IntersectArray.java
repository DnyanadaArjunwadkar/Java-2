import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
/*
 * Given two arrays, write a function to compute their intersection.
Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
Note:
Each element in the result must be unique.
The result can be in any order.
 */

public class IntersectArray {
public static int[] intersect(int[] nums1, int[] nums2) 
{
	ArrayList<Integer> al1= new ArrayList<Integer>();
	for(int i=0;i<nums1.length;i++)
	{
		Integer k= new Integer(nums1[i]);
		al1.add(k);	
	}
	
	ArrayList<Integer> al2= new ArrayList<Integer>();
	for(int i=0;i<nums2.length;i++)
	{
		Integer k= new Integer(nums2[i]);
		al2.add(k);	
	}
	Collections.sort(al1);
	Collections.sort(al2);
	ArrayList<Integer> result= new ArrayList<Integer>();
	if(nums1.length>nums2.length)
	{
		for(int i=0;i<al2.size();i++)
		{
			if(al1.contains(al2.get(i)))
			{
				result.add(al2.get(i));
				al1.remove(al2.get(i));
			}
		}		
	}
	if(nums1.length<nums2.length)
	{
		for(int i=0;i<al1.size();i++)
		{
			if(al2.contains(al1.get(i)))
			{
				result.add(al1.get(i));
				al2.remove(al1.get(i));
			}
		}		
	}
	if(nums1.length==nums2.length)
	{
		for(int i=0;i<al1.size();i++)
		{
			if(al2.contains(al1.get(i)))
			{
				result.add(al1.get(i));
				al2.remove(al1.get(i));
			}
		}		
	}
	HashSet<Integer> hs= new HashSet<Integer>(result);
	int[] resultArray= new int[hs.size()];
	Iterator itr= hs.iterator();
	int index=0;
	while(itr.hasNext())
	{
		resultArray[index]=(int) itr.next();
		index++;
	}
	
	return resultArray;        
    }
	public static void main(String[] args) {
		
		int[] nums1={1,2,2,1}; 
		int []nums2 = {2,2};
		System.out.println(Arrays.toString(intersect(nums1,nums2)));
	}
}
