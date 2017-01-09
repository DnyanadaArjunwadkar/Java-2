package blog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ThirdMaxInt {
	public static int thirdMax(int[] nums) 
    {
		TreeSet<Integer> ts= new TreeSet <Integer> ();
		for(int i=0;i<nums.length;i++)
		{
			Integer i2=new Integer(nums[i]);
			ts.add(i2);
		}
	ArrayList<Integer> al= new ArrayList<Integer>(ts);
	Collections.reverse(al);
	if(al.size()>=3)
	{		
		return al.get(2);
	}
	else if(al.size()==2)
	{		
		return Collections.max(al);
	}
	else
	{		
		return al.get(0);
	}
	
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2};
	    System.out.println(thirdMax(a)) ;
	}

}
