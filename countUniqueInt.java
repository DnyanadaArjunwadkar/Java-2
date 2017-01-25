import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//count unique elements and return the size
public class countUniqueInt {
	 public static int[] removeDuplicates2(int[] nums) 
	 {
	        Set<Integer> s1= new HashSet<Integer>();
	        for(int i=0;i<nums.length;i++)
	        {
	            s1.add(nums[i]);
	        }
	        ArrayList<Integer> al= new ArrayList<Integer>(s1);
	        int[] arr=new int[al.size()];
	       for(int i=0;i<al.size();i++)
	       {
	    	   arr[i]=al.get(i);
	       }
	        return arr;
	  }	 
	 public static int removeDuplicates(int[] nums) 
	 {
		 int len=nums.length;
		 int p1=0;
		 while(p1<nums.length-1)
		 {
			 int p2=p1+1;			 
			 if(nums[p1]==nums[p2])
			 {
				 len--;
			 }
			 p1++;
		 }	       
	        return len;
	 }
	 public static int removeDuplicates3(int[] A) {
			if (A.length==0) return 0;
	    int j=0;
	    for (int i=0; i<A.length; i++)
	        if (A[i]!=A[j]) A[++j]=A[i];
	    return ++j;
		 }
	public static void main(String[] args) {
		int[] a={1,1,2};
		int[] b={1,1,1,1,2,2,3};
		System.out.print((removeDuplicates3(b)));
		
	}

}
