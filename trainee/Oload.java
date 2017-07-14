class Oload
{
int add(int a,int b)
{

return a+b;
}
//void add(int a,int b)
//{
//System.out.println(a+b);

//}
int add(int a,int b ,int c)
{

return a+b+c;
}

double add2(int a,double b)
{

return a+b;
}
double add2(double a,double b)
{

return a+b;
}
double add(int a,int b,int c,int d)
{
return a+b+c+d;

}
double add3(double a,double b)
{
return a+b;

}
double add3(int a,int b)
{
return a+b;

}
double add3(double a,int  b)
{
return a+b;

}
public static void main(String args[])
{
Oload l=new Oload();
System.out.println(l.add(2,3));
System.out.println(l.add2(2,3));
System.out.println(l.add2(2.88,3));
System.out.println(l.add(2,3,4,5));
System.out.println(l.add3(2.0,3.0));
System.out.println(l.add3(2.0,3));

}





}