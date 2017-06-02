import java.util.HashMap;

public class ArrayPairTarget {

	public static void main(String[] args)
	{
		int[] a={1, 5, 7, -1, 5};
		int target=6;
		findPairs(a,target);
	}

	private static void findPairs(int[] a, int target) 
	{
		//tc:O(n)
		//sc:O(n)
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				System.out.println(a[hm.get(a[i])]+":"+a[i]);
			}
			else
			{
				hm.put(target-a[i], i);
			}
		}		
	}
}
