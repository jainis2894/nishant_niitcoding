class Base
{
public int i=1;
protected int j=2;

//private void display()
//{
//System.out.println("hiiiiiiiiii");

//}

}

class Derived extends Base
{

void print()
{
System.out.println("hello");

}
public static void main(String args[])
{
	Derived d=new Derived();
	//d.display();
System.out.println(d.j);

}

}