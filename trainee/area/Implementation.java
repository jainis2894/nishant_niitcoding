import java.util.*;
class Implementation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your option");
String op=sc.nextLine();
if(op.equals("SQUARE"))
new Square().area();
else if(op.equals("CIRCLE"))
new Circle().area();
else if(op.equals("RECTANGLE"))
new Rectangle().area();
else
System.out.println("INVALID INPUT");



}

}