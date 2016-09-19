/*
 * This is implementation of Bucket sort.
 * 1)take array of numbers.
 * 2)determine maximum.
 * 3)decide number of buckets to use by taking sq.rrot of Total number N.
 * 4)determine divider by formula= max+1/number of buckets
 * 5)divide each element in array by divider to determine target bucket.
 * 6) once elements are in buckets, use insertion sort or any other sort.
 * Link reffered: https://www.youtube.com/watch?v=geVyIsFpxUs
 * */package latest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class bucket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Random r= new Random();
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/
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
				
		//determine number of buckets
		int num_buckets=(int) Math.ceil(Math.sqrt(size));
	//	System.out.println("num_buckets:"+num_buckets);
		//determine Max val from array
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
	//	System.out.println("max:"+max);
		
		//determine divider
		int divider=((max+1)/num_buckets);
		//System.out.println("divider:"+divider);
		//target bucket
		
		
		//till this point elements are inserted in different buckets. now apply sort to thses buckets
		List<List<Integer>> parent_list = new ArrayList<List<Integer>>();
		for(int z=0;z<num_buckets+1;z++)
		{
			ArrayList<Integer> baby_list= new ArrayList<>();
			parent_list.add(baby_list);
		}
		for(int i=0;i<a.length;i++)
		{
		int target=(int) Math.floor(a[i]/divider);
		//System.out.println("item:"+a[i]+": target bucket:"+target);
		parent_list.get(target).add(a[i]);
		}
		
		for(int k=0;k<parent_list.size();k++)
		{
			//System.out.println("Printing Bucket_"+k);
			//System.out.println("\n");
		//	System.out.println("item in Bucket_"+k+": are:");
			for(int ui=0;ui<parent_list.get(k).size();ui++)
			{
				//System.out.print(parent_list.get(k).get(ui)+",");
			}
			//System.out.println("\n");
		}		
		for(int k=0;k<parent_list.size();k++)
		{
			//System.out.println("Printing Bucket_"+k);
			//System.out.println("\n");
			//System.out.println("item in Bucket_"+k+": are:");
			for(int ui=0;ui<parent_list.get(k).size();ui++)
			{
				
				//USE YOUR OWN SORTING METHOD
				Collections.sort(parent_list.get(k));
			}
			//System.out.println("\n");
		}		
		//to print sorted buckets
		System.out.println("\n");
		for(List<Integer> temp: parent_list){
			System.out.print(temp);
		}	
	}
}
