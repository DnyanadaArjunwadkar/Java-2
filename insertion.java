/**
 * https://www.youtube.com/watch?v=lCDZ0IprFw4
 */

package latest;

import java.util.Scanner;

public class insertion {

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
		int j,temp,key;
		for(int i=1;i<a.length;i++)
		{
			key=a[i];
			j=i-1;	
		while(j>=0&&key<a[j])
		//if(a[j]>a[i])
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;	
			j--;
		}
		for(int y:a)
			System.out.println(y);
		}

	}

}
