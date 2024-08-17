package pack1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicatewords {

	public static void main(String[] args) {
		
		String input="I am am omprasad omprasad";
		
		String[] input1=input.split(" ");
		
		Set<String> myset=new LinkedHashSet<String>();
		
		for(String x:input1)
		{
			myset.add(x);
		}
		 
		Iterator it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}

	}

}
