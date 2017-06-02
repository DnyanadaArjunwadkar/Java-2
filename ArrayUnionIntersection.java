import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayUnionIntersection {

	public static void main(String[] args) 
	{
		
		//two sorted arrays
		int arr1[] = {1, 3, 4, 5, 7,9};
		int arr2[] = {2, 3, 5, 6,9};
		int arr3[] = { 3, 5, 8,9};
		
		//intersUnion1(arr1,arr2);
		//Union2(arr1,arr2);
		//intersection1(arr1,arr2);
		
		intersectionOf3Arrays(arr1,arr2,arr3);
		//3 sorted array and arr1=loongest, arr2=2nd longest, arr3=smallest
	}

	private static void intersectionOf3Arrays(int[] arr1, int[] arr2,int[] arr3) 
	{
		int m=arr1.length;
		int n=arr2.length;
		int q=arr3.length;
		int i=0;
		int j=0;
		int k=0;
		while(i<m && j<n && k<q)
		{
			//System.out.println(": i :"+i+": j :"+j+": k :"+k);
			if(arr1[i]<arr2[j])
			{
				//System.out.print(arr1[i]);
				//System.out.print(" ");
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				//System.out.print(arr2[j]);
				//System.out.print(" ");
				j++;
			}
			else
			{
				if(arr1[i]==arr3[k])
				{
					System.out.println(arr1[i]);
				}
				//System.out.print(" ");
				j++;
				i++;
				k++;
			}
		}
		if(i==arr1.length)
		{
			
			System.out.println("here");
			
			while(j<arr2.length && k<arr3.length)
			{
				if(arr1[i]!=arr2[j])
				{
					j++;
				}
				else
				{
				 if(k<arr3.length)
				 {
					 if(arr2[j]==arr3[k])
					 {
						 System.out.println(arr2[j]);
					 }
					 else
					 {
						 j++;
						 k++;
					 }
				 }
				}
			}
			//System.out.println(": i :"+i+": j :"+j+": k :"+k);
		}
		if(j==arr2.length)
		{
			while(k<arr3.length)
			{
				if(arr1[i-1]==arr2[j-1])
				{
					if(arr3[k]==arr1[i-1])
					{
						System.out.println(arr3[k]);
						
					}
					k++;
				}
			}
		}
	}

	private static void Union2(int[] arr1, int[] arr2) 
	{
		int m=arr1.length;
		int n=arr2.length;
		int i=0;
		int j=0;
		while(i<m && j<n)
		{
			//System.out.println("i:"+i+": j :"+j);
			if(arr1[i]<arr2[j])
			{
				System.out.print(arr1[i]);
				System.out.print(" ");
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				System.out.print(arr2[j]);
				System.out.print(" ");
				j++;
			}
			else
			{
				System.out.print(arr1[i]);
				System.out.print(" ");
				j++;
				i++;
			}
		}
		
	}

	private static void intersection1(int[] arr1, int[] arr2) 
	{
		//sc:constant
		//tc:linear
		System.out.println();
		int m=arr1.length;
		int n=arr2.length;
		int i=0;
		int j=0;
		while(i<m && j<n)
		{
			//System.out.println("i:"+i+": j :"+j);
			if(arr1[i]<arr2[j])
			{
				//System.out.print(arr1[i]);
				//System.out.print(" ");
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				//System.out.print(arr2[j]);
				//System.out.print(" ");
				j++;
			}
			else
			{
				System.out.print(arr1[i]);
				System.out.print(" ");
				j++;
				i++;
			}
		}
		
	}

	
	
	
	private static void intersUnion1(int[] arr1, int[] arr2) 
	{
		//Binarysearch O(logn)+ traversing O(n)=O(n)
		//sc:set+arraylist
		ArrayList<Integer> intersec= new ArrayList<Integer>();
		Set<Integer> uni= new HashSet<Integer>();
		
		//traverse the smaller array linearly
		for(int i=0;i<arr1.length;i++)
		{
			int res=Arrays.binarySearch(arr2, arr1[i]);
			if(res>0)
			{
				intersec.add(arr1[i]);
			}
			uni.add(arr1[i]);
		}
		
			for(int i=0;i<arr2.length;i++)
			{
				uni.add(arr2[i]);
			}
		
		System.out.println("intersec:"+intersec);
		System.out.println("union:"+uni);
		System.out.println("*******************");
	}


}
