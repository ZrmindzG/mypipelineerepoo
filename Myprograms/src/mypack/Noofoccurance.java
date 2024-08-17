package mypack;

import java.util.HashMap;
import java.util.Map;

public class Noofoccurance {
	
	public static void main(String args[]) {
	
	String job="test,test,test1,test1,ram,ram";
	
	String[] jb=job.split(",");
	
	Map<String,Integer> words=new HashMap<String,Integer>();
	
	for(String word:jb )
	{
		Integer count=words.get(word);
	  
		if(count==null)
	   {
		   words.put(word,1);
	   }
	   else
	   {
		   words.put(word, count+1);
	   }
	}
	System.out.println(words);
}

}

