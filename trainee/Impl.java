class Impl implements Ainterface,Binterface
{
public void fn2()
{
System.out.println("impl class");
}
public static void main(String args[])
{
Impl i=new Impl();
i.fn();
}

}