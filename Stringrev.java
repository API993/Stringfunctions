/*
3. write a java program 
   take first string iterate the string store those letters in a list
   reverse the list
   iterator everything and check if its same as original
 */  

import java.util.*;
public class Stringrev 
{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
         System.out.println("ENTER STRING");
         String str = sc.nextLine();
         
         ArrayList<Character> arr = new ArrayList<>();
         
         for(int i = 0 ;i<str.length();i++)
        	 arr.add(str.charAt(i));
        
     //    System.out.println(arr);
         Collections.reverse(arr);
        
         StringBuilder sb = new StringBuilder();
         
         for(int i =0 ; i<arr.size() ; i++)
        	 sb = sb.append(arr.get(i));
         
         if(str.equals(sb.toString()))
        	 System.out.println("STRING IS A PALINDROME");
         
         else
        	 System.out.println("STRING IS NOT A PALINDROME");
	}

  System.out.println("These changes are been made in branch1");
  System.out.println("Following changes are been made in branch 2");


}
