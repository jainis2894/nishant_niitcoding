
public class LambdaHelloWorld {
	interface MathOperation
	{
		int operation (int a,int b);
		String a(int s,int y,int k);
	}
	private int operate (int a,int b,MathOperation mathoperation)
	{
		return mathoperation.operation(a, b);
		
	}
	public static void main(String args[])

	{
		LambdaHelloWorld tester =new LambdaHelloWorld();
		//MathOperation addition =(int a,int b)->a+b;
		//MathOperation ad =(int s,int y,int k)->a+b+c;
		//System.out.println("10+5 "+tester.operate(10,5,addition));
	}

}
