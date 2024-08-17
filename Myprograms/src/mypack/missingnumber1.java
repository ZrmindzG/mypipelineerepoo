 package mypack;

public class missingnumber1 {
	
	public static void main(String args[])
	{
		int a[]= {1,3,4,5,6,7,8,9};
				
		//sum-1+5+7+9=22
		//sum-missing-1+3+5+7+9=25		
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
    	}
		System.out.println(sum);
		int sum1=0;
		for(int i=1;i<=9;i++)
		{
			sum1=sum1+i;
			
		}
		//System.out.println(sum1);
		System.out.println(sum1-sum);
	}

}
