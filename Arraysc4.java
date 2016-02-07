/*
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx". 
src:http://codingbat.com/java/Warmup-2
countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
*/

public class Arraysc4 {
public static void countXX(String s1)
{
	int cnt=0;
char[] c=s1.toCharArray();
      for(int i=0;i<c.length;i++)
      {
	   if(c[i]=='x')
	   {
		   if(i+1>=c.length)
			   break;
		   else{
		       if(c[i+1]=='x')
			   cnt++;
		   }
	   }

      }
      System.out.println("/number of occurances of xx");
    System.out.println(cnt);  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="xxdnyxxanadxx";
countXX(s1);
	}

}
