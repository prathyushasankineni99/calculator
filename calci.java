import java.util.*;
class Calculator
{
void sum(int a,int b)
{
System.out.println(a+b);
}
void sub(int a,int b)
{
System.out.println(a-b);
}
void mult(int a,int b)
{
System.out.println(a*b);
}
void div(int a,int b)
{
System.out.println(a/b);
}
}
class Arithmetic
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a and b values");
a=s.nextInt();
b=s.nextInt();
Calculator c=new Calculator();
c.sum(a,b);
c.sub(a,b);
c.mul(a,b);
c.div(a,b)
}
}