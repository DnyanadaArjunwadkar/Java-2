package latest;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		System.out.println("Enter numbers:");
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		HashMap<Integer, Integer>hm= new HashMap<Integer,Integer>();
		for(int i=0;i<=n;i++)
		{
			hm.put(i+1, 0);
		}
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
			 hm.put(a[i], 1);
			}
		}
		
		for(Entry<Integer,Integer> en:hm.entrySet())
		{
			
			
			if(en.getValue().equals(0))
			{
				System.out.println("Missing :"+en.getKey());
			}
		}
		
		
	}

}
