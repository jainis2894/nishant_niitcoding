public class Pattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int t=5;t>=i+1;t--)
			System.out.print(" ");
			for(int j=1;j<=i;j++)
				{
					
					System.out.print("* ");
								
				}
			System.out.print("\n");
		
		}
		for(int i=4;i>0;i--)
		{	
			for(int t=1;t<=4-i;t++)
			System.out.print(" ");
			for(int j=1;j<=i;j++)
			System.out.print(" *");
			System.out.print("\n");
		}
	}
}