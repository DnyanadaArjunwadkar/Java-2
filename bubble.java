package latest;

import java.util.Scanner;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("give numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
		}
		
      for(int pass=1;pass<=a.length;pass++)
      {
    	  for(int j=0;j<a.length-pass;j++)
    	  {
    		  if(a[j]>a[j+1])
    		  {
    			  int temp=a[j];
    			  a[j]=a[j+1];
    			  a[j+1]=temp;
    		  }
    	  }  
      }
      for(int num:a)
      {
    	  System.out.println(num);
      }
		
	}

}
