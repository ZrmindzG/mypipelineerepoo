package mypack;

public class Removestringvthspace {
	
	public static void main(String[] args)
	{
		String s="lifestyle ";
		
		char removech="o";
		
		char s1[]=s.toCharArray();
		
		StringBuilder str=new StringBuilder();
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=ch)
			{
			  str.append(s1[i]);	
			}
			
			System.out.print(s1[i]);
		}
		
		
	}

}
