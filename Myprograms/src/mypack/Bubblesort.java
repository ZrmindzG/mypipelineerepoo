package mypack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubblesort {
	
	public static void main(String[] args)
	{
		int a[]= {11,2,8,9,15,81};
		
		System.out.println("this is the element before sorting:"+ Arrays.toString(a));
		
		int temp;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					 temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					
				}
			}
		}
		System.out.println("this is the element after sorting:"+ Arrays.toString(a));
	}

}
