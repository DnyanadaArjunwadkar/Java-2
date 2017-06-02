import java.util.Arrays;

public class ArrayContains {

	public static void main(String[] args) 
	{
		int[] a={34,1,2,6,78,90,43};
		//1,2,6,34,43,78,90
		Arrays.sort(a);
		//First sort in O(nlogn) time then binary search in O(logn)
		System.out.println(ContainsOrNot(a,78));
	}

	private static int ContainsOrNot(int[] a,int n) 
	{
		int low=0;
		int high=a.length-1;
		
		while(low<=high)
		{
			int mid= (high+low)/2;
			
			if(a[mid]==n)
			{
				return mid;				
			}
			if(a[mid]>n)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}			
		}		
		return -1;
	}

	private static int binSearch(int[]a,int low, int high,int n) 
	{
		
				return 0;
	}

}
