//reverse array// src:leetcode
import java.util.Arrays;
public class ArrayC1 {
public static void swap(int[] arr,int a1, int a2)
{
int temp;
temp=arr[a1];
arr[a1]=arr[a2];
arr[a2]=temp;


}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int[] arr={2,11,3,1};
		int p1=0;
		int p2=arr.length-1;
		while(p1<p2)
		{
			swap(arr,p1,p2);
			p1++;
			p2--;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
