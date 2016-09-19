package latest;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
for(int i=3;i<100;i++)
{
	int flag=1;
	
		for(int j=2;j<i-1;j++)
	{
		if(i%j==0)
		{
			flag=0;
			//System.out.println(":"+i+"not a prime");
			break;
		}
		
	}
	if(flag==1)
	{
		System.out.print(""+i+",");
	}
	

}

	}

}
