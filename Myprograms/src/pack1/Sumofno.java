package pack1;

public class Sumofno {
	
	public static void main(String[] args)
	{
		int num=76611213;
		
		int sum=0;
		
		while(num>0)
		{
			sum+=num%10;
			sum/=10;
			
		}
		
		System.out.println("sum of the no :"+ sum);
	}

}
