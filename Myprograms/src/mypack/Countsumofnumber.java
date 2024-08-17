package mypack;

public class Countsumofnumber {
	
	public static void main(String[] args)
	{
		int num=7763411;
		
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num/10;
			num=num/10;
		}
		System.out.println("this is sum of the number: "+ sum);
	}

}
