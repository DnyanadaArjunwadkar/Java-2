
public class ArrayTop2 {

	public static void main(String[] args) 
	{
		int[] a={0, -2147483648, -2};
		int m1=Integer.MIN_VALUE;
		int m2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(m1<a[i])
			{
				m2=m1;
				m1=a[i];
			}
			else
			{
				if(m2<a[i])
				{
					m2=a[i];
				}
				
			}
		}
		System.out.println("m1:"+m1);
		System.out.println("m2:"+m2);
	}

}
