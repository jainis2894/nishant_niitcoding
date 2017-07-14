class ArrExcept
{

public static void main(String args[])
{
	
	int n[]={1,2,3,4,5};
	try{
	System.out.println(n[5]);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
}

}