
public class ArrayAllRepeatsExceptOneXOR 
{

	public static void main(String[] args) 
	{
		int[] a={1,1,2,2,3,3,5,6,6,7,7};
		int ans=occringOnce(a);
		System.out.println(ans);
	}

	private static int occringOnce(int[] a) 
	{
		//tc:linear
		//sc:constant
		int result = 0;
		for(int i=0;i<a.length;i++)
		{
			result=result ^ a[i];
		}
		return result;
	}

}
