package mypack;

public class Reversestring {
	
	public static void main(String args[])
	{
		String str="my name is omprasd";
		
		String[] str1=str.split(" , ");
		
		for(int i=str1.length-1;i>0;i--)
		{
			System.out.println("this is the reverse string:" +str1[i]);
		}
		
		//System.out.println("this is the reverse string:" +str1[i]);
	}

}
