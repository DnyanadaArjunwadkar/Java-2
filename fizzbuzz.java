package blog;

import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {
	public static List<String> fizzBuzz(int n) {
        ArrayList<String> ans= new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
           if(i%3==0 && i%5==0)
            {
                ans.add("fizzbuzz");
            }
           else if(i%3==0)
            {
               ans.add("fizz"); 
            }
           else if(i%5==0)
            {
               ans.add("buzz");  
            }
           else
           {
        	   ans.add(String.valueOf(i));   
           }
         
        }
		return ans;
        
    }
	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}

}
