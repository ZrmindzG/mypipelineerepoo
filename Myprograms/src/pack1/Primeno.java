package pack1;

import java.util.Scanner;

public class Primeno {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		if(prime(num))
		{
			System.out.println("this is prime no");
		}
		else
		{
			System.out.println("this is not a prime no");
		}
	
	}
	public static boolean prime(int num)
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
