package mypack;

public class Fibinassiseries {
	
	public static void main(String[] args)
	{
		// 0 1 1 2 3 5 8 13
		
		int n1=0, n2=1, sum =0;
		
		System.out.println(n1+" "+n2);
		
		for(int i=2;i<10;i++)
		{
			sum=n1+n2; //0+1=1
			
			System.out.println("printing the sum of number:"+ sum);//1
			
			n1=n2;// 1
			n2=sum;
		}
		
		System.out.println("this is fibonessi series:"+ sum);
		
	
	}

}
