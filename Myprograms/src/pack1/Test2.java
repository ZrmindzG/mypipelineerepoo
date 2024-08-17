package pack1;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
	
	public static void main(String args[])
	{
		String s= "Omprabhu prasad Sahu";
				 
				//output should be = O=1, m=1,p=2, r=2, a=3,b=1.........
	   char[] aa=s.toCharArray();
		
		//String aa[]= s.split(",");
		
		Map<char,Integer> mp=new HashMap<char,Integer>();
		
		for(char word:aa)
		{
			Integer count=mp.get(word);
			
			if(count==null)
			{
				mp.put(word, 1);
			}
			else
			{
				mp.put(word, count+1);
			}
			
			
	}
		System.out.println("no of repetating words:"+mp);		
	}

	
}
