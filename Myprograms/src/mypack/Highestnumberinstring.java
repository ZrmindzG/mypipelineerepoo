package mypack;

public class Highestnumberinstring {
	
	public static void main(String args[])
	{
		int[] arr=new int[] {2,7,8,9,11,13,15};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max)
             {
	          max=arr[i];
              }
//			if(arr[i]>max)
//			{
//				max=arr[i];
//			}
		}
		System.out.println("highest no in string:"+max);
	}

}
