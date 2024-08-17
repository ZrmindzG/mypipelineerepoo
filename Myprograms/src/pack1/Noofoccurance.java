package pack1;

import java.util.HashMap;
import java.util.Map;

public class Noofoccurance {
	
	public static void main(String args[]) {
		
		String a="test,test,test1,test1,test2,test2";
		 
		String[] a1=a.split(",");
		
		Map<String,Integer> hm=new HashMap<String,Integer>();
		
		for(String Words:a1)
		{
			Integer count=hm.get(Words);
			{
				if(count==null)
				{
					hm.put(Words, 1);
				}
				else
				{
					hm.put(Words, count+1);
				}
			}
			
		}
		System.out.println("This is number of repetation of word:"+ hm);
	}

}
