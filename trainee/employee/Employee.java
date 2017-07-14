import java.io.*;
class Employee implements Serializable
{
 private String name;
 private double sal;
private int age;
String getName()
{
return this.name;
}
void setName(String name)
{
 this.name=name;
}

double getSalary()
{
return this.sal;
}

void setSalary(double d)
{
this.sal=d;
}
int getAge()
{
return this.age;
}
void setAge(int age)
{
this.age=age;
}
}