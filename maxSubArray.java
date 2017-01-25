import java.util.ArrayList;
import java.util.Collections;

public class maxSubArray {

public static int maxSubArray(int[] nums) 
{
	
	int p1=0;
	int sum=0;
	ArrayList<Integer> al= new ArrayList<Integer>();
	while(p1+1<nums.length)
	{
		int p2=p1+1;
		int temp=nums[p1];
		sum=sum+temp;
		sum= sum+nums[p2];
		System.out.println("p1 :"+p1+": p2 :"+p2+": temp :"+temp+": sum :"+sum);
		if(sum>temp)
		{
			p1++;
			System.out.println("sum>temp");
		}
		else
		{
			p1=p2;			
			al.add(sum);
			sum=0;
		}		
	}	
	System.out.println("al :"+al);
	int max=Collections.max(al);
	return max;        
    }	
	public static void main(String[] args) 
	{
	  int[] arr={-2,1,-3,4,-1,2,1,-5,4};
	  System.out.println(maxSubArray(arr));

	}

}
