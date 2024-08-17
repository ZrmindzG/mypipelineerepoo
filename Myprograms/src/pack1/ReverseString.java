package pack1;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String a="my name is omprasad";
		
		String b=" ";
		
		for(int i=a.length()-1;i>0;i--)
		{
			 b=b+a.charAt(i);
		}
		System.out.println("reverse string is :"+b);
	}

}
