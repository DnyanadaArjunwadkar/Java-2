import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ArrayReverseInPlace {

	public static void main(String[] args) 
	{
		int[] a={-1,2,-3,4};
		int[] b={11,22,33,44,55};
		System.out.println(Arrays.toString((reverse1(a))));
		System.out.println(Arrays.toString((reverse1(b))));
		System.out.println(reverse2(a));
		System.out.println(reverse2(b));
	}
	private static int[] reverse1(int[] a) 
	{	
		//sc:O(1)
		//tc:O(n)
		  for(int i1=0;i1<a.length/2;i1++)
		  {
			  int j=a.length-1-i1;
			  int temp=a[i1];
			  a[i1]=a[j];
			  a[j]=temp;
		  }
		return a;
	}
	private static ArrayList<Integer> reverse2(int[] a) 
	{	
		//sc:O(n)
		//tc:O(n)
		//use stack/arraylist sc will be same
		Stack<Integer> st= new Stack<Integer>();
		  for(int i1=0;i1<a.length;i1++)
		  {
			  st.push(a[i1]);
		  }
		return new ArrayList<Integer>(st);
	}

}
