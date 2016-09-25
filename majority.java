package latest;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class majority {

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
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(!hm.containsKey(a[i]))
			{
				hm.put(a[i], 1);
			}
			else
			{
				hm.put(a[i],hm.get(a[i])+1);
			}
		}
		//System.out.println(Arrays.asList(hm)); 
		//System.out.println(Collections.singleton(hm)); 
		TreeMap<Integer,Integer> tm= new TreeMap<Integer,Integer>(hm);
		//System.out.println("yes:");
		//System.out.println(tm.firstEntry());
		
		for(Entry<Integer, Integer> entry:tm.entrySet())
		{
			 // System.out.println("Key : " + entry.getKey()
			//	+ " Value : " + entry.getValue());
			//System.out.println("n:"+n);
			//System.out.println("n/2:"+n/2);
			  if(entry.getValue()>n/2)
			  {
				  System.out.println("Your Majority numbe is :" + entry.getKey()	+ " Value : " + entry.getValue());
			  }
			  else
			  {
				 System.out.println("No such number Honey!");
			  }
		}
		}
	
 

}
