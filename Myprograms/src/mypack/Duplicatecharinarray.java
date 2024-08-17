package mypack;

public class Duplicatecharinarray {
	
	public static void main(String args[])
	{
		String str="oomm orra sssad";
		
		int count=0;
		
		char[] abc=str.toCharArray();
		
		for(int i=0;i<abc.length;i++)
		{
			for(int j=i+1;j<abc.length-1;j++)
			{
				if(abc[i]==abc[j])
				{
					count++;
					System.out.println("number of repetative char"+ abc[j]);
				}
				
			}
			
		}
		
	}

}
