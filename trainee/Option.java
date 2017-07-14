import java.util.*;
class Option
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the option");
		String s=sc.nextLine();
		
		switch(s)
		{
			case "x":
			System.out.println("hi");
			break;
			case "y":
			System.out.println("hi,hi");
			break;
			case "z":
			System.out.println("Hello");
			break;


		}
	}
}