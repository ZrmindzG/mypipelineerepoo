package mypack;

public class Secondlargest {
	
	public static void main(String args[])
	{
		int array[] = {10, 20, 25, 63, 96, 57};
		
		int temp,arr;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		//System.out.println("the second largest no in an array:"+ array[array.length-2]);
		System.out.println("the  largest no in an array:"+ array[array.length-1]);
		System.out.println("the  2ndlargest no in an array:"+ array[array.length-2]);
		System.out.println("the  3rdlargest no in an array:"+ array[array.length-3]);
		System.out.println("the  4thlargest no in an array:"+ array[array.length-4]);
		System.out.println("the  5thlargest no in an array:"+ array[array.length-5]);
	}

}
