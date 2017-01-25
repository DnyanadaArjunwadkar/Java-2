import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {
   public static int majorityElementNby2(int[] nums) 
    {
       HashMap<Integer,Integer> tm= new HashMap<Integer,Integer>(); 
       for(int i=0;i<nums.length;i++)
       {
    	   if(!tm.containsKey(nums[i]))
    	   {
    		   tm.put(nums[i],1);
    	   }
    	   else
    	   {
    		   tm.put(nums[i], tm.get(nums[i])+1);
    	   }
       }
      int max=Collections.max(tm.values());
       for(Map.Entry<Integer,Integer>e:tm.entrySet())
       {
    	   int check=e.getValue();
    	   if(check>(nums.length/3))
    	   {
    		   //if(max<check)
    		   {
    			   if(e.getValue()==max)
    	    		   return e.getKey();
    		   }
    	   }  	   
       }
	return -1;
    }
   public static List<Integer> majorityElement(int[] nums) 
   {
       HashMap<Integer,Integer> tm= new HashMap<Integer,Integer>(); 
       for(int i=0;i<nums.length;i++)
       {
    	   if(!tm.containsKey(nums[i]))
    	   {
    		   tm.put(nums[i],1);
    	   }
    	   else
    	   {
    		   tm.put(nums[i], tm.get(nums[i])+1);
    	   }
       }
      int max=nums.length/3;
      ArrayList<Integer> al = new ArrayList<Integer>();
       for(Map.Entry<Integer,Integer>e:tm.entrySet())
       {
    	   int check=e.getValue();
    	   if(check>(nums.length/3))
    	   {
    		   //if(max<check)
    		   {
    			   if(e.getValue()>=max)
    	    		  al.add(e.getKey());
    		   }
    	   }  	   
       }
	return al;	   
   }
	public static void main(String[] args) 
	{
		int[] x={1,1,1,1,5,6};
		//System.out.println(majorityElementNby2(x));
System.out.println(2/3);
		//int[] arr={1,2};
		//int[] arr={0,0,0};
		//int[] arr={1,2,3};
        int[] arr={5,5,5,3};
        //System.out.println("1:------>"+majorityElementNby2(arr));
		System.out.println(majorityElement(arr));
	}

}
