import java.util.Arrays;

public class SortBubble {

	public static void main(String[] args) {
		int[] a= {64, 34, 25, 12, 22, 11, 90};
		//System.out.println(Arrays.toString(bubbleSort(a)));
		System.out.println(Arrays.toString(bubbleSort2(a)));

	}

	private static int[] bubbleSort2(int[] a) {
		//correct approach: largest element on right most
		//tc:O(n^2)
		//spc:const
		for(int i=0;i<a.length;i++)
		{
			System.out.println(Arrays.toString(a));
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}				
			}
		}
		
		return a;
	}

	private static int[] bubbleSort(int[] a) 
	{
		//this is not the right way to do bubble sort
		//in following approach smallest element end up at left most position
		
	for(int i=0;i<a.length-1;i++)
		{
		for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				System.out.println(Arrays.toString(a));
			}
		}
		
		return a;
	}

	

}
