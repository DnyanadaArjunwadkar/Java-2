package latest;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Print number");
int i=scan.nextInt();

int ans=fact(i);
System.out.println(ans);
/*
int ans=1;
for(int j=1;j<i+1;j++)
{
ans=ans*j;
}
System.out.println(ans);
	}
*/

		}

	private static int fact(int i) {
		// TODO Auto-generated method stub
		System.out.println("in method");
		int k=i;
		int ans2 = 0;
		while(k>1)
		{
		ans2=fact(i-1)*i;
		}
		return ans2;
	}
}
