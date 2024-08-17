package mypack;

import java.util.Scanner;

public class Numberofwordsinstrings {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the char");
		
		String s=sc.nextLine();
		
	 int count=countnumberofwords(s);
	 System.out.println("the is word :"+count);
		
	}

	private static int countnumberofwords(String s) {
	   int count=0;
	   if(s.charAt(0)!=' ')
		{
			count++;
		}
	   for(int i=0;i<s.length();i++)
	   {
		   if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
		   {
			   count++;
		   }
		  
	   }
	return count;
	 
	}

}
