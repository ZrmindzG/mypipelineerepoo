package pack1;

import java.util.HashMap;
import java.util.Map;

public class Noofocc {

	public static void main(String[] args) {
		
		String a= "men,men, women,women,laides,laides";
		
		String[] aa=a.split(",");
		
		Map<String,Integer> mp=new HashMap<String,Integer>();
		
		for(String b:aa)
		{
			Integer count=mp.get(b);
			if(count==null)
			{
				mp.put(b,1);
			}
			else
			{
				mp.put(b,count+1);
			}
		}
		
		System.out.print(mp);

	}
	
}
