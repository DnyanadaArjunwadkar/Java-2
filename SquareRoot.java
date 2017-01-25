
public class SquareRoot {

	public static void main(String[] args) 
	{
		System.out.println("26 :"+SqRt(26));
		System.out.println(Math.sqrt(26));
		System.out.println("5 :"+SqRt(5));
		System.out.println(Math.sqrt(5));
	}

	private static int SqRt(int x) 
	{
		int start=0;
		int end=x;
		int result=0;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(mid*mid==x)
				return mid;
			if(mid*mid<x)
			{
				start=mid+1;
				result=mid;
			}
			else
				end=mid-1;
		}
		return result;	
	}
}
