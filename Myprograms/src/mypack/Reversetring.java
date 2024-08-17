package mypack;

public class Reversetring {

	public static void main(String args[])
	{
		String str="my name is omprasd";
		
		String str1=" ";
		
		for(int i=str.length()-1;i>0;i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println("this is revere string after reverse:"+str1);
			
			
			
	}
	
}
