package mypack;

import java.util.HashMap;
import java.util.Map;

public class occurance {
	
	public static void main(String args[]) {
	       
	       String aar="apple,apple,pineapple,pineapple,banana,banana";
	       
	       String[] a=aar.split(",");
	       
	       Map<String,Integer> mp=new HashMap<String,Integer>();
	       
	       for(String b:a)
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
	       System.out.println("the no of repeatation of words:"+ mp);
	    }
	}


