import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class kthSmallestLargest {

	public static void main(String[] args) 
	{
		int[] a={13,2,24,8,76,34,6,0,21,90};
		method1(a,8);
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		

	}

	private static void method1(int[] a,int k) 
	{
	 TreeMap<Integer,Integer> tm= new TreeMap<Integer,Integer>();
	 for(int i=0;i<a.length;i++)
	 {
		 tm.put(a[i], 1);
	 }
	 int sm = 0,lg=0,kth=0;
	 int cnt=0;
	 for(Map.Entry<Integer,Integer>e:tm.entrySet())
	 {
		 if(cnt==0)
		 {
			 sm=e.getKey();
		 }
		 if(cnt==a.length-1)
		 {
			 lg=e.getKey();
		 }
		 if(cnt==k)
		 {
			 kth=e.getKey();
		 }
		 cnt++;
	 }
	 System.out.println("Smallest :"+sm);
	 System.out.println("Largest :"+lg);
	 System.out.println("kth :"+kth);
	}

}
