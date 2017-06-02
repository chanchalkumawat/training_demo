class A
{
public void sum()
{
int a=2,b=4;
int c;
c=a+b;
System.out.println("Sum is : "+c+" "+ "Method os super class is called");
}
}

class B extends A
{
public void sum()
{
System.out.println("Calling method of sub class");
super.sum();
}
}


class Overriding
{
public static void main(String arg[])
{
B b1= new B();
b1.sum();

}
}
