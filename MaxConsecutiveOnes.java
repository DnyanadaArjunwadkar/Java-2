import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
/**
 Given a binary array, find the maximum number of consecutive 1s in this array.
Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:
The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000 
 */
public class MaxConsecutiveOnes 
{
	public static void main(String[] args) 
	{
	  int[] arr={1,1};
	  System.out.println(MaxConsOnes(arr));

	}

	private static int MaxConsOnes(int[] arr) 
	{
		Stack<Integer> st= new Stack<Integer>();
		ArrayList<Integer> Count= new ArrayList<Integer>();
		int i=0;
		while(i<arr.length)
		{
			int element=arr[i];
			if(element==1)
			{
				st.push(element);
			}
			if(element==0)
			{
				Count.add(st.size());
				st.clear();
			}			
			i++;
		}	
		if(i==arr.length)
		{
			Count.add(st.size());
		}
		return Collections.max(Count);
	}

}
