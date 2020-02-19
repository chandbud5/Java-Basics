
public class ConstructorDemo
{
    public static void main(String[] args)
    {
        A obj = new A();    // Object created with Default Constructor
        A obj1 = new A(5);  // Object created with Parameterized Constructor
    }
}
class A
{
    public A()
    {
        System.out.println("This is default constructor");
    }
    public A(int i)     // This can also be called as Constructor Overloading (Polymorphism)
    {
        System.out.println("This is parameterized constructor, integer passed is = "+ i);
    }
}