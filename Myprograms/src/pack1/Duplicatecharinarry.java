package pack1;

import java.util.HashMap;
import java.util.Map;

public class Duplicatecharinarry {
	
	public static void main(String args[])
	{
		String a="oommpprasad sahu is my name";
		
		//String a1[] =a.split(",");
		
		
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(int i=0;i<a.length();i++)
		{
			    char ch = a.charAt(i);
			    
			     Integer b=mp.get(ch);
			     
			     if(b==null)
			     {
			    	 mp.put(ch, 1);
			     }
			     else
			     {
			    	 mp.put(ch, b+1);
			     }
					   
		}
	     System.out.println(mp);
	}

}
