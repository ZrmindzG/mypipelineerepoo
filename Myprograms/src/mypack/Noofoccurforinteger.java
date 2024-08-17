package mypack;

import java.util.HashMap;
import java.util.Map;

public class Noofoccurforinteger {
	
	public static void main(String args[])
	{
		int[] cnt= {1,1,1,2,2,3,3,4,4};
		
		Map<Integer,Integer> cntint=new HashMap<Integer,Integer>();
		
		for(int cont:cnt)
		{
			Integer conti=cntint.get(cont);
			
			if(conti==null)
			{
				cntint.put(cont, 1);
			}
			else
			{
				cntint.put(cont, conti+1);
			}
		}
		System.out.println("this is no of integer occurance:"+cntint);
	}

}
