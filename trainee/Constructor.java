class Constructor
{
	private Constructor()
	{
		System.out.println("private Constructor");
	}
	public Constructor(int a,int b)
	{
		System.out.println("public constructor");
	}
	protected Constructor(int a)
	{
		System.out.println("protected  constructor");
	}
	
}