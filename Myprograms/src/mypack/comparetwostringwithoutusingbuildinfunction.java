package mypack;

public class comparetwostringwithoutusingbuildinfunction {
	
	public static void main(String[] args)
	{
		String s="student";
		String s1="student";
		boolean s3=false;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				s3=false;
				break;
			}
			s3 =true;
		}
		System.out.println("both the string are equal:"+ s3);
			
	}

}
