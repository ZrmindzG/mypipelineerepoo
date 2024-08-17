package pack1;

import java.lang.reflect.Array;

public class HighestNlowestno {

	public static void main(String[] args) {


		//int list[] = {33, 55, 88, 66, 44};
		//int  list=new Array['33', '55', '88', '66', '44']
		int[] arr=new int[]{33, 55, 88, 66, 44};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max)
			{
				max=arr[i];
			}
//			if(list[i]>max)
//			{
//				max=list[i];
//			}
//			
		}
       System.out.println(max);
	}

}	
	
