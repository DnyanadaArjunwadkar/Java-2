package blog;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] res=new int[nums1.length+nums2.length];     
        System.arraycopy(nums1, 0, res, 0, nums1.length);
        System.arraycopy(nums2, 0, res, nums1.length, nums2.length);
       
        Arrays.sort(res);
        System.out.println("Concatenated and Sorted Array :"+Arrays.toString(res));
        if(res.length % 2==1)
        {
        	int ind=(res.length+1)/2;
        	return res[ind-1];//-1 because it arrays are zero based
        }
        else
        {       	
        	int ind1=res.length/2;
            int ind2=ind1-1;//-1 because it arrays are zero based
            return ((double)(res[ind1]+res[ind2])/2);
        }
    }
	
	public static void main(String[] args) 
	{
		    int [] nums1 = {1,63,8};
			int []	nums2 = {112,9,8};			
			System.out.println(findMedianSortedArrays(nums1,nums2));
	}

}
