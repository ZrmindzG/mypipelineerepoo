package mypack;

public class Reversewordusingbuilder {
	
	public static void main(String[] args)
	{
		String str="welcome to new life";
		
		String[] str1= str.split(" ");
		
		String myword=" ";
		
		for(String w:str1)
		{
			StringBuilder sb=new StringBuilder(w);
			
			sb.reverse();
			
			myword=myword+sb.toString()+" ";
					
		}
		System.out.println("my revese string the using buildermethod:"+ myword);
		
		
		
		
	}

}
