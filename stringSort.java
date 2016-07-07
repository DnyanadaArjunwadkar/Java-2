/*
 * Sort Strings based on their Length.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class stringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your strings:");
	    Scanner sc= new Scanner(System.in);
	    
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    String s3=sc.nextLine();
	    int matches=0;
	    String s11=s1.replaceAll("\\s", "");
		String s22=s2.replaceAll("\\s", "");
		String s33=s3.replaceAll("\\s", "");
		
		int l1=s11.length();
		int l2=s22.length();
		int l3=s33.length();
		
		HashMap<String,Integer> hm=new HashMap();
		hm.put(s11, l1);
		hm.put(s22, l2);
		hm.put(s33, l3);
		
		Set<Entry<String, Integer>> set=hm.entrySet();
		List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list,new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}			
		});
		for(Entry<String,Integer> entry:list)
		{
			 System.out.println("KEy:"+entry.getKey()+": Value :"+entry.getValue());

		}
		
		

	}

}
