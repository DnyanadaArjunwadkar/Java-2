import java.util.Arrays;

public class SortQuick {

	public static void main(String[] args) {
		int[] a= {4,2,3,5,1,16,9};	
		quickSort2(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	private static void quickSort2(int[] a,int low, int high) {
		
		if(a==null || a.length==0)
			return;
		if(low>=high)
			return;			
		int mid= (low+high)/2;
		int pivot=a[mid];
		
		int i=low;
		int j=high;
		while(i<=j)
		{
			while(a[i]<pivot)
			{
				i++;
			}
			while(a[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}			
		}
		if(i<high)
		{
			quickSort2(a,i,high);
		}
		if(low<j)
		{
			quickSort2(a,low,j);
		}
		
	}

}
