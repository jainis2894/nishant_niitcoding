 class A 
{
	  int i=1;
	  int j=2;
	  int k=3;
//void print()
//{
//System.out.println(i);
//System.out.println(j);
//System.out.println(k);
//}
}
class B extends A
{
void print()
{
//super.print();
System.out.println(i);
System.out.println(j);
System.out.println(k);
}

int i=5;
int j=6;
int k=7;
int d=10;
public static void main(String args[])
{
	//A a=new A();

B b= new B();
b.print();
A a=new B();
//a.print();
System.out.println(a.i);
System.out.println(a.j);
System.out.println(a.k);
System.out.println(a.d);
}

}