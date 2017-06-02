class A
{
public void even(int a)
{

if (a%2 == 0)
{
System.out.println("even number");
}
else
{
System.out.println("odd number");
}
}
}

class B extends A
{
private void hello()
{
System.out.println("Hello");
}
public static void main(String arg[]){
B b1=new B();
   b1.even(7);
   b1.hello();
}
}
