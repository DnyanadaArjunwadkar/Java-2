import java.util.ArrayList;
import java.util.Arrays;

public class arrPosNeg {

	public static void main(String[] args) {
		int[] a={-3,7,2,5,-1,-2,-9,12};
		//int[] b={-5, 5, -2, 2, 4};
		//-5, 5, -2, 2, -8, 4, 7, 1, 8, 0
		System.out.println(Arrays.toString(altPositiveNegative2(a)));
		System.out.println(Arrays.toString(altPositiveNegative1(a)));
	}

	private static int[] altPositiveNegative2(int[] a) {
		//space:Const 
		//memory Very important
		int p=0,n=0;
		int[]  result= new int[a.length];
		int i=0;
		boolean pos_turn=true;
		boolean neg_turn=true;
		while(p<a.length && n<a.length)
		{
			if(pos_turn)
			{
				if(a[p]>0)
				{
					result[i]=a[p];
					i++;
					p++;
					pos_turn=false;
					neg_turn=true;
				}
				else
				{
					p++;
				}
			}
			else if(neg_turn)
			{
				if(a[n]<0)
				{
					result[i]=a[n];
					i++;
					n++;
					pos_turn=true;
					neg_turn=false;
				}
				else
				{
					n++;
				}
			}			
		}
		System.out.println("p:"+p+":n:"+n+":i:"+i);
		if(p==a.length)
		{
			while(n<a.length && i<a.length)
			{
				result[i]=a[n];
				i++;
				n++;
			}
		}
		if(n==a.length)
		{
			while(p<a.length && i<a.length)
			{
				result[i]=a[p];
				i++;
				p++;
			}
		}		
		return result;
	}

	private static int[] altPositiveNegative1(int[] a) {
		//space O(n)
		
		ArrayList<Integer> ap=new ArrayList<Integer>();
		ArrayList<Integer> an=new ArrayList<Integer>();
		int[] result=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				an.add(a[i]);
			}
			else
			{
				ap.add(a[i]);
			}
		}
		System.out.println(ap);
		System.out.println(an);
		int p1=0;
		int n1=0;
		int i=0;
		for(;i<result.length;i++)
		{
			if(i%2==0)
			{
				if(ap.size()!=p1)
				{
				result[i]=ap.get(p1);
				p1++;
				}
				else
				{
					System.out.println("breaking for because of p1");
					break;
				}
			}
			else
			{
				if(an.size()!=n1)
				{
				result[i]=an.get(n1);
				n1++;
				}
				else
				{
					System.out.println("breaking for because of n1");
					break;
				}
			}
		}
		if(p1==ap.size())
		{
			while(n1!=an.size())
			{
				result[i]=an.get(n1);
				i++;
				n1++;
			}
		}
		if(n1==an.size())
		{
			while(p1!=ap.size())
			{
				result[i]=ap.get(p1);
				i++;
				p1++;
			}
		}
		
		return result;
	}

}
