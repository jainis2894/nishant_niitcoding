import java.util.*;
 public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String temp=""; 
		for(int i=s.length()-1;i>=0;i--)
			{
				temp=temp+s.charAt(i);				
			}
		//System.out.println(temp);
		if(s.equals(temp))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}

} 