package latest;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] arr= new int[10];
		arr[0]=0;
		arr[1]=1;
		for (int i=2;i<10;i++)
		{		
			{
				arr[i]=arr[i-2]	+arr[i-1];				
			}
			System.out.println(arr[i]);
		}
	}
}
