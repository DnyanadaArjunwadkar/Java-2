import java.util.LinkedHashMap;
import java.util.Map;

public class Arrays1stRepating {

	public static void main(String[] args) 
	{
	int[] a={10, 5, 3, 4, 3, 5, 6};
	int ans=repeat1(a);
	System.out.println(ans);
	int ans2=nonrepeat1(a);
	System.out.println(ans2);
	}

	private static int nonrepeat1(int[] a) 
	{
		LinkedHashMap<Integer,Integer> hm= new LinkedHashMap<Integer,Integer> ();
		 for(int i=0;i<a.length;i++)
		 {
			 if(hm.containsKey(a[i]))
			 {
				 
				 hm.put(a[i], hm.get(a[i])+1);
			 }
			 else
			 {
				 hm.put(a[i], 1);
			 }
		 }
		 for(Map.Entry<Integer,Integer> e:hm.entrySet())
		 {
			 if(e.getValue()==1)
			 {
				 return e.getKey();
			 }
		 }
		return 0;
	}

	private static int repeat1(int[] a) 
	{
	 LinkedHashMap<Integer,Integer> hm= new LinkedHashMap<Integer,Integer> ();
	 for(int i=0;i<a.length;i++)
	 {
		 if(hm.containsKey(a[i]))
		 {
			 
			 hm.put(a[i], hm.get(a[i])+1);
		 }
		 else
		 {
			 hm.put(a[i], 1);
		 }
	 }
	 for(Map.Entry<Integer,Integer> e:hm.entrySet())
	 {
		 if(e.getValue()>1)
		 {
			 return e.getKey();
		 }
	 }
		return 0;
	}

}
