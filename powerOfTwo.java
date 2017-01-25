
public class powerOfTwo {
	public static boolean isPowerOfTwo(int n) 
    {
        if(n==1)
        return true;
        if(n<=0)
        return false;
        return(0==(n&(n-1)));
    }
	public static void main(String[] args) 
	{
		System.out.println("1:"+isPowerOfTwo(1));
		System.out.println("0:"+isPowerOfTwo(0));
		System.out.println("2:"+isPowerOfTwo(2));
		System.out.println("15:"+isPowerOfTwo(15));
		System.out.println("64:"+isPowerOfTwo(64));
		System.out.println(Integer.bitCount(00000000000000000000000000001011));

	}

}
