/*
 * Anagrams problem 2
 * from : https://www.hackerrank.com/challenges/java-anagrams
 */

import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String a1=a.toLowerCase();
        String b1=b.toLowerCase();
        char[] c1=a1.toCharArray();
        char[] c2=b1.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
            {
            //System.out.print("Yes");
           return true;
            
        }
        else
            {
             return false;
        }
            
        
        
        // Complete the function by writing your code here.
        
    }
  
    public static void main(String[] args) {
    	System.out.print("Enter strings:");
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}