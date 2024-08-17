
public class Duplicatechar {
	
	public static void main(String args[])
	{
		
		int[] ar={5,9,1,8,2,6};
		int[] temp;
		int j;
		
		
		while(ar>0) {
			
			int sc=ar.length;
			
			for(int i=0;i<=ar.length;i++)
			{
				if(ar[i]>ar[i+1])
				{
					System.out.println("finding greatest no");
					
					int temp1=ar[i];
					
					ar[j]= temp1;
					
				}
			}
			
		}
	}

}
