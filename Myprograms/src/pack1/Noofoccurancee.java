package pack1;

import java.util.HashMap;
import java.util.Map;

public class Noofoccurancee {

	public static void main(String[] args) {
		
		String arr = "man,man,women,women,ladies,laides";

		String[] arr1=arr.split(",");
		
		Map<String,Integer> mp=new HashMap<String,Integer>();
		
		for(String a:arr1)
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
		System.out.println("no of occurance in the string :"+ mp);
	}

}
