package latest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayPairs {

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
		System.out.println("Enter the target Sum Number:");
		int target=sc.nextInt();

Arrays.sort(a);
System.out.println("watch");
for(int a1:a)
System.out.print(a1+",");
System.out.println("");
ArrayList<Integer> al = new ArrayList<>();
outerloop:
		for(int i=0;i<a.length;i++)
		{
			innerloop:
			for(int j=0;j<a.length;j++)
			{
				int flag=0;
				//System.out.println("i:"+i+": j :"+j);
				if(i==j)
				{
				//System.out.println("Do nothing");
				flag=1;
				
				}
				if(a[i]+a[j]==target && flag==0)
				{   if(al.contains(a[i]) || al.contains(a[j]))
				    {
					 flag=2;
				    }
				
				else{
					     if(flag==0)	
					     {
							  al.add(a[i]);
							  al.add(a[j]);
							
							System.out.println("Mission accomplished");
							System.out.println("i:"+i+": j :"+j);
							System.out.println("a[i]:"+a[i]+": a[j] :"+a[j]);
				     	 }					
				    }
			    }
		}
	}

}
}
