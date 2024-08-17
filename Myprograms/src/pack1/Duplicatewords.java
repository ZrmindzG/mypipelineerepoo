package pack1;

import java.util.HashMap;
import java.util.Map;

public class Duplicatewords {

	public static void main(String[] args) {
		
		String[] arry= {"cat","dog","dog","sun","sun","sun"};
		
				
		Map<String,Integer> mp=new HashMap<String,Integer>();
		
		for(String a:arry)
		{
			Integer count=mp.get(a);
			if(count==null)
			{
				mp.put(a,1);
			}
			else
			{
				mp.put(a, count+1);
			}
					
		}
		System.out.println("no of duplicate char in the arr"+mp);

	}

}
