
import java.util.Scanner;
class A{

public void add()
{
int a=2,b=5;
int c;
c=a+b;
System.out.println("Addtion is: "+c);
}

public int addition(int a, int b)
{
        
    int res=a+b;
    return res;
}
}


class Practice{
public static void main(String args[])
{
    
    Scanner sc = new Scanner(System.in);
    A obj=new A();//create object for class A
    obj.add();

    System.out.println("Enter first number:");
    int num1 = sc.nextInt();
    System.out.println("Enter second number:");
    int num2 = sc.nextInt();
   
    int result=obj.addition(num1,num2);
    System.out.println("result is : "+result);





}

}
