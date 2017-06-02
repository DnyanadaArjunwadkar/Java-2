
public class ArrayUnsortedSmallestGreatest {

	public static void main(String[] args) 
	{
		int[] a={34,1,2,6,78,90,43};
		greatestSmallest(a);
	}
	private static void greatestSmallest(int[] a) 
	{
		//tc:O(n)
		//sc:O(1)
		int smallest=Integer.MAX_VALUE;
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
			}
			if(largest<a[i])
			{
				largest=a[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}
