package mypack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicatewordcount {
	
	public static void main(String[] args)
	{
		duplicatecount("Test Test dev Test Test dev Test doc Test dev dev dev Test Test dev dev Test");
	}
	
	public static void duplicatecount(String str)
	{
		//String str = "Test Test dev Test Test dev Test doc Test dev dev dev Test Test dev dev Test";
		
		String[] ste=str.split(" ");
		
		Map<String,Integer> stor= new HashMap<String,Integer>();
		
		for(String w:ste)
		{
			if(stor.containsKey(w))
			{
				stor.put(w.toLowerCase(), stor.get(w)+1);
				//stor.put(w.g, stor.get(w)+1);
				
			}
			else
			{
				stor.put(w, 1);
			}
			
		}
		System.out.println(stor);
		
//		Set<String>word=stor.keySet();
//		
//		for(String w:word)
//		{
//			if(stor.get(w)>1)
//			{
//				System.out.println(w+":"+stor.get(w));
//			}
//		
//		
//			
//			
//		}
		
		
				
				
	}

}
