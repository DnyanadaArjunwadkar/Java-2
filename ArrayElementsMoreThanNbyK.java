import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayElementsMoreThanNbyK {

	public static void main(String[] args) 
	{
		int[] a={3, 1, 2, 2, 1,1, 2, 3, 3};
		int n=4;
		System.out.println(method1(a,n));
	}

	private static ArrayList<Integer> method1(int[] a, int n) 
	{
		//time O(n)
		//sc=O(n)
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!hm.containsKey(a[i]))
			{
			hm.put(a[i], 1);
			}
			else
			{
				hm.put(a[i], hm.get(a[i])+1);
			}
		}
		ArrayList<Integer>al= new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer>e:hm.entrySet())
		{
			if(e.getValue()>(a.length/n))
			{
				al.add(e.getKey());
			}
				
		}
		return al;
	}

}
