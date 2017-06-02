class Area
{
public void area(double r)
{
double ar;
ar=3.14*r*r;
System.out.println("Area of circle is :"+ar);
}

public void area(int l,int b)
{
int a;
a=l*b;
System.out.println("Area of rectangle: "+a);
}

public void area(int s)
{
int sq;
sq=s*s;
System.out.println("Area of square is :"+sq);
}
}

class Poly
{
public static void main(String arg[])
{
Area obj= new Area();
obj.area(2.2);
obj.area(5,8);
obj.area(4);
}
}
