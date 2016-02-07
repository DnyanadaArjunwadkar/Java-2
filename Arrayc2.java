/*
 * int[] ip={1,1,3,4} array with duplicates
 * int[] ip={1,3,4} SAME array eliminating duplicates
 * #of duplicates:
 * # off unique elements
 Question source: Leetcode
 */
import java.util.Arrays;
public class Arrayc2 {
	public static void printarr(int[] arr,int limit)
	{
		for(int i=0;i<limit;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip={88,23,21,3,1,3,1,7,7,88,21,105};
		int cnt=0;
	    int p1=0;
		int repeat=0;
		
		while(p1!=ip.length){
		for(int p2=p1+1;p2<=ip.length-1;p2++)
		  {
			if(ip[p1]==ip[p2])
			{
			    cnt++;
				ip[p2]=-1;
			}
		  }
		p1++;
		} 
		for(int i=0;i<ip.length;i++)
		{
			if(ip[i]==-1)
			{
				repeat++;
			}
		}
		
		int unique=ip.length-repeat;
		System.out.println("Number of comparisons :"+cnt);
		System.out.println("Number of Unique Elements:"+unique);
		System.out.println("After -1 assigned :");
		System.out.println(Arrays.toString(ip));

		int new1=0;
		while(new1!=unique)
		{
			for(int i=0;i<ip.length;i++)
			
		    {
			if(ip[i]!=-1)
			 {
				ip[new1]=ip[i];
				new1++;
			 }
	       	}
			
		}
		System.out.println("After new array eliminating duplicates:");
		printarr(ip,unique);
		System.out.println(" Number of repeats (# -1)");
		System.out.println(" "+repeat);
		System.out.println("Number of duplicates: "+(ip.length-unique));
		
	}

}
