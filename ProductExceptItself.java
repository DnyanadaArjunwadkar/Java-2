import java.util.Arrays;

public class ProductExceptItself {
	   public static  int[] productExceptSelf(int[] nums) 
	    {
		   int result[]= new int[nums.length];
		   int p1=0;
		   for(int i=0;i<nums.length;i++)
		   {
			   int product=1;
			   for(int j=0;j<nums.length;j++)
			   {
				   if(j!=i)
				   {
					   product=product*nums[j];
				   }
			   }
			   result[i]=product;
		   }		   
		 return result;
	    }
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4};
	    System.out.println(Arrays.toString(productExceptSelf(arr)));

	}

}
