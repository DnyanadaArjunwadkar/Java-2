import java.util.Arrays;
import java.util.Scanner;

public class vowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("enter a string:");
		 Scanner sc= new Scanner(System.in);
		    String s1=sc.nextLine();
		    String s11=s1.replaceAll("\\s", "");
		    char[] c1=s11.toCharArray();
		    char c2[]=new char[c1.length+1];
		    int vowel=0;
		    int conso=0;
		    int c2Index=0;
		    for(int i=0;i<c1.length;i++)
		    {
		    	
		    	  char ch=c1[i];
		    	 
		    		  c2[c2Index]=ch;
		    		  c2Index++;
		    		  System.out.println("c2[c2Index] :"+c2[c2Index]);
		    		  for(int k=i+1;k<c2.length;k++)
		  		    {
		  		    	 char ch2=c2[k];
		  		    	 System.out.println("loop 2 ch :"+ch2);
		  		    	  int asc=(int)ch2;
		  		    	  if(asc==65||asc==97||asc==69||asc==101||asc==73||asc==105||asc==79||asc==111||asc==85||asc==117)
		  		    	  {
		  		    		  vowel++;
		  		    		  System.out.println("vowel :"+ch2+": count :"+vowel);
		  		    	  }
		  		    	 
		  		    	  else
		  		    	  {
		  		    		  conso++;
		  		    		  System.out.println("Conso:"+ch+": count :"+conso);
		  		    	  }
		  		    	
		  		    }
		    	  
		    }
		   
		    System.out.println("Conso:"+conso+": Vowel :"+vowel);
	}

}
