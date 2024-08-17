package pack1;

public class SecondlargestNo {
	
	public static void main(String[] args)
	{
		int array[] = {10, 20, 25, 63, 96, 57};
		
		int temp;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length-1;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("the second largest no:"+ array[array.length-1]);
	}

}
