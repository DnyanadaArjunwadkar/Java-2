/*Given a string and a non-negative int n, return
 a larger string that is n copies of the original string. 
src:http://codingbat.com/java/Warmup-2
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
first3("dnyanada",2) -> "dnydny"
*/

public class Arraysc3 {
	public static void stringTimes(String s1, int n)
	{
		String s2=s1;
		
		for(int i=1;i<n;i++)
		{
			s1=s1.concat(s2);
		
		}
		System.out.println("your output is:");	
		System.out.println(s1);	
		
	}
	public static void first3(String s1,int n)
	{
		char[] c=s1.toCharArray();
		String result="";
		for(int i=0;i<n;i++)
		{
			result=result+c[i];
		}
		stringTimes(result,2);// printing first 3 chars 'dny' twice=2 times
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Welcome");
    String s1;
    s1="dny";
    stringTimes(s1,3);
    first3("dnyanada",3);//passing 3 as this is to get first 3 char
	}

}
