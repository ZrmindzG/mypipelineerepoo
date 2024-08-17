package mypack;

import java.util.HashMap;

import java.util.Map;

public class Nooccurepractice {
	
	public static void main(String args[])
	{
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
//		String wd="test,test,test1,test1,test2,test2";
//		
//		String[] wd1=wd.split(",");
//		
//		Map<String,Integer> wds=new HashMap<String,Integer>();
//		
//		for(String words:wd1)
//		{  
//			Integer count=wds.get(words);
//			if(count==null)
//			{
//				wds.put(words, 1);
//			}
//			else
//			{
//				wds.put(words, count+1);
//			}
//			
//		}
//		System.out.println("This is number of repetation of word:"+ wds);
//		}
	


