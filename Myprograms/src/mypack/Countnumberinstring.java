package mypack;

public class Countnumberinstring {
	
	public static void main(String[] args)
	{
		int num=76611213;
		
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("the number of integer in a string:" +count);
	}

}
