import java.util.ArrayList;

public class BullsCows {
	
	public static String getHint2(String secret, String guess) 
	{
        int len = secret.length();
		int[] secretarr = new int[10];
		int[] guessarr = new int[10];
		int bull = 0, cow = 0;
		for (int i = 0; i < len; ++i) {
			if (secret.charAt(i) == guess.charAt(i)) {
				++bull;
			} else {
				++secretarr[secret.charAt(i) - '0'];
				++guessarr[guess.charAt(i) - '0'];
			}
		}
		for (int i = 0; i < 10; ++i) {
			cow += Math.min(secretarr[i], guessarr[i]);
		}
		return "" + bull + "A" + cow + "B";
    }
	public static String getHint(String secret, String guess) 
	{
		int A=0;//bulls->exact pair position match 
		int B=0;//cows-> just contains in other positions
		
		ArrayList<Character> secList= new ArrayList<Character>();
		ArrayList<Character> guessList=new ArrayList<Character>();
		for(int i=0;i<secret.length();i++)
		{
			secList.add(secret.charAt(i));
			guessList.add(guess.charAt(i));
		}
		ArrayList<Character> s2= new ArrayList<Character>();
		ArrayList<Character> g2=new ArrayList<Character>();
		for(int i=0;i<guessList.size();i++)
		{
			Character g=guessList.get(i);
			Character s=secList.get(i);
			if(g.equals(s))
			{
				A++;		
			}
			else
			{
				s2.add(s);
				g2.add(g);
			}
		}
		System.out.println("SL:"+secList);
		System.out.println("GL:"+guessList);
		for(int i=0;i<g2.size();i++)
		{
			Character g=g2.get(i);
			if(s2.contains(g))
			{
				B++;
				s2.remove(g);
			}
		}
		
		return A+"A"+B+"B";
	}
	public static void main(String[] args) 
	{
		System.out.println(getHint("11","11"));
	}

}
