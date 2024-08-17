package mypack;

import java.util.Scanner;

public class oddevennumber {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int read=sc.nextInt();
		
		if(read%2==0)
		{
			System.out.println("this is even num");
		}
		else
			System.out.println("odd");
	}

}
