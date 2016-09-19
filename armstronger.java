package latest;

import java.util.Scanner;

public class armstronger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		int rmnd=1;
	
		while(n>0)
		{
			
			rmnd=n%10;
			n=n/10;
			sum=sum+rmnd*rmnd*rmnd;
		//	System.out.println("in while sum:"+sum);
		}
		//System.out.println("-------final while sum:"+sum);
		if(num==sum)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println(" NOT armstrong number");
		}
	}

}
