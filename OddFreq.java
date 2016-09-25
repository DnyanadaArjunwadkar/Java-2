package latest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class OddFreq {

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
		
		for(Entry<Integer, Integer> en:hm.entrySet() )
		{
			//System.out.println(en);
	        int n1=hm.get(en.getValue());
	        //System.out.println("n1:"+n1);
			
			if(n1%2==0)
			{
			//	System.out.println("number:"+en.getKey()+": frequency EVEN:+"+n1);
			}
			else
			{
				System.out.println("number:"+en.getKey()+": frequency ODD:+"+n1);
			}
			
			
		}
		
	}

}
