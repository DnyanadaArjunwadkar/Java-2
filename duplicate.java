/*
 * Detect duplicate characters in a string.
 * give frequency/ number of occurrences of characters
 */
import java.util.Arrays;
import java.util.Scanner;
public class duplicate {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub		
		System.out.println("Enter a String to detect duplicates:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String str2=str.replaceAll("\\s","");
		System.out.println("str2:"+str2);
		char[] str_char=str2.toCharArray();
		
		int char_len=str_char.length;
		if(char_len==0)
		{
			System.out.println("you have entered a null string.");
		}
		else
		{
		System.out.println("char_len:"+char_len);
	    
		char[] temp=new char[char_len];
		int index=0;
		int duplicates=0;
		for(int i=0;i<char_len;i++)
		{
			char ch=str_char[i];			
			System.out.println("ch:"+ch);
			temp[index]=ch;
			index++;		
			int freq=1;
			for(int k=i+1;k<str_char.length;k++)
			{			
				if(!Arrays.asList(str_char).contains(ch))
				{ 
					if(ch==str_char[k])
					{
						freq++;
						System.out.println("Duplicate Detected at position:"+k+":it is:"+str_char[k]);
						System.out.println("Frequency :"+freq);
						duplicates++;
					}
				}
			}
		}	
		if(duplicates==0)
		{
			System.out.println("String does not contain any duplicates.");
		}
	}//else
 }//main
}//class
