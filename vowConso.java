/*
 * Determine unique consonants and vowels.
 * their frequency
 * sort according to frequency
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class vowConso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("string please:");
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String s11=s1.replaceAll("\\s", "");
		char[] c1=s11.toCharArray();
		char[] temp_c=new char[c1.length];
		char[] temp_v=new char[c1.length];
		int v=0;
		int c=0;
		int index_v=0;
		int index_c=0;
		HashMap<String,Integer> hc=new HashMap();
		HashMap<String,Integer> hv=new HashMap();
		
		for(int i=0;i<c1.length;i++)
		{
			char ch=c1[i];
			int asc=(int)ch;
				//System.out.println("ch:"+ch);
			if(asc==65||asc==97||asc==69||asc==101||asc==73||asc==105||asc==79||asc==111||asc==85||asc==117)
	    	  {
	    		  v++;
	    		  temp_v[index_v]=ch;
	    		  index_v++;
	    		//  System.out.println("vowel :"+ch+": count :"+v);
	    		  if(!hv.containsKey(String.valueOf(ch)))
		  			{
		  			hv.put(String.valueOf(ch), 1);
		  			}
		  			else
		  			{
		  				 hv.put(String.valueOf(ch),  hv.get(String.valueOf(ch))+1);
		  			}  
	    	  }
			else
			 {
					 c++;
					 temp_c[index_c]=ch;
	    		  index_c++;
	    		  if(!hc.containsKey(String.valueOf(ch)))
		  			{
		  			     hc.put(String.valueOf(ch), 1);
		  			}
		  			else
		  			{
		  				 hc.put(String.valueOf(ch),  hc.get(String.valueOf(ch))+1);
		  			}		    		  
				// System.out.println("Cnnsonant:"+ch+": count :"+c);
			 }			
		}
		/*
		  for(int k=0;k<c1.length;k++)
	    	{
	    	System.out.println("temp_c:"+temp_c[k]);
	    	}
	    	for(int m=0;m<c1.length;m++)
	    	{
	    	System.out.println("temp_v:"+temp_v[m]);
	    	}
		
		*/
		
		System.out.println("Unique conso:"+hc.size());
		System.out.println("Unique Vowel:"+hv.size());
		System.out.println("Conso:"+c+": Vowel :"+v);
		System.out.println("HashMap consonants:::");
		 
		 for(Entry<String,Integer> entry : hc.entrySet())
		    {   //print keys and values
		         System.out.println(entry.getKey() + " : " +entry.getValue());
		    }
		 	System.out.println("HashMap Vows:::");
		 
		 for(Entry<String,Integer> entry : hv.entrySet())
		    {   //print keys and values
		         System.out.println(entry.getKey() + " : " +entry.getValue());
		    }
		 System.out.println("Sorted : HashMap consooo:---------------->");
		 Set<Entry<String,Integer>> set=hc.entrySet();
		 List<Entry<String,Integer>> list= new ArrayList<Entry<String,Integer>>(set);
		 Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}});
		 for (Entry<String, Integer> entry : list) {
			  System.out.println("KEy:"+entry.getKey()+": Value :"+entry.getValue());
	        }
		
		 System.out.println("HashMap VOVOVOVOVOVOVOVOvoovoovovovo:::------------------->");
		 Set<Entry<String,Integer>> set2=hv.entrySet();
		 List<Entry<String,Integer>> list2=new ArrayList<Entry<String,Integer>>(set2);
		 Collections.sort(list2,new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
			 
		 });
		 
		 for (Entry<String, Integer> entry : list2) {
	            System.out.println("KEy:"+entry.getKey()+": Value :"+entry.getValue());

	        }
		 
	}

}

