import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//find duplicate
public class ArrayDuplicate {

	public static void main(String args[])
	{
		int a[]={1,-2,3,1,2,2,3,6,6};
		System.out.println("Method 1:"+method1(a));
		System.out.println("Method 2:"+method2(a));
		System.out.println("Method 3:"+method3(a));	
		System.out.println("Method 4:"+Remove_Duplicates(a));	
	}

	private static String Remove_Duplicates(int[] a) 
	{
		Arrays.sort(a);
		System.out.println("this:"+Arrays.toString(a));
		//-3, -3, -2, -1, 1, 2, 2, 6, 6
		int first=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			int check=a[i];
			if(first!=check)
			{
				System.out.println(check);
			}
			//else
			{
				first=check;
			}
		}		
		return null;
	}

	private static Set<Integer> method3(int[] a) 
	{
		
		//This is imp **********************
		//source: GeekforGeeks
		//tc: O(n) and Sc:O(1)
		//can not handle -ve duplicate ints in constant space.
		//This is imp **********************
		Set<Integer> al= new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[Math.abs(a[i])]>=0)
			{
				a[Math.abs(a[i])]=-a[Math.abs(a[i])];
			}
			else
			{
				al.add(Math.abs(a[i]));
			}
		}		
		return al;
	}

	private static Set<Integer> method2(int[] a)
	{
		//used additional storage for set1
		//tc:O(n)
		
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> answer=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(set1.contains(a[i]))
			{
				answer.add(a[i]);
			}
			else
			{
				set1.add(a[i]);
			}
		}
		return answer;
	}

	private static Set<Integer> method1(int[] a) 
	{
		//Naive implementation
		//tc:O(n^2)
		System.out.println("a.length-1 :"+(a.length-1));
		Set<Integer> result= new HashSet<Integer>();
		int limit=(a.length-1);
		for(int i=0;i<limit;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println("i"+i+": j:"+j);
				if(a[i]==a[j])
				{
					result.add(a[i]);
				}
			}
		}
		return result;
	}	
}
