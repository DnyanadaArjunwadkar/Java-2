import java.util.Arrays;

public class SortInsertion {

	public static void main(String[] args) {
		int[] a= {9,14,3,2,43,11,58,22};	
		System.out.println(Arrays.toString(insertionSort2(a)));

	}

	private static int[] insertionSort2(int[] a) 
	{
		int p1=0;	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		return a;
	}

}
