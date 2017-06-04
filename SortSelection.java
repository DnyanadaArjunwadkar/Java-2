import java.util.Arrays;

public class SortSelection {

	public static void main(String[] args) {
		int[] a= {9,7,6,5,4,3,2,1,55,43,66,6789,65};	
		System.out.println(Arrays.toString(selecttionSort2(a)));
	}

	private static int[] selecttionSort2(int[] a) 
	{
		//Time:O(n^2)
		//spc:constant
		for(int i=0;i<a.length;i++)
		{
			int min=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<min)
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		return a;
	}

}
