package pack1;

import java.util.HashMap;
import java.util.Map;

public class Noofoccuranceint {
	
	public static void main(String args[])
	
	{
		int[] cnt= {1,1,1,2,2,3,3,4,4};
		
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		
		for(int a:cnt)
		{
			Integer count=mp.get(a);
			
			if(count==null)
			{
				mp.put(a, 1);
			}
			else
			{
				mp.put(a, count+1);
			}
		}
		System.out.println("this is no of integer occurance:"+mp);
	}

}
