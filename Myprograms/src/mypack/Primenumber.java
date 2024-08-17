package mypack;

import java.util.Scanner;

public class Primenumber {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		if(isprime(num))
		{
			System.out.println("this is prime no");
		}
		else
		{
			System.out.println("this is not a prime no");
		}
	}
	
	public static boolean isprime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%2==0)
			{
				return false;
			}
		}
		return true;
	}

}
