/*  USING SUPER KEYWORD WITH
1) Constructor
2) Methods
3) Variables
 */
class Super
{
    public static void main(String[] args)
    {
        Sub obj = new Sub();
        Sub obj1 = new Sub(3);
    }
}

class Sup
{
    int a = 7;
    public Sup()
    {
        System.out.println("Default constructor called of a Super Class");
    }
    public Sup(int i)
    {
        System.out.println("Parameterized Constructor of Super class");
    }
    void show()
    {
        System.out.println("This is show method of Super class");
    }
}
class Sub extends Sup
{
    public Sub()
    {
        super(5);   // This will call Super class's parameterized constructor
        System.out.println("Default Constructor called of a Sub class");
        System.out.println(super.a);    //Accessing super class's variables
    }
    public Sub(int i)
    {
        super();    //This will call Super class's default Constructor
        System.out.println("Parameterized Constructor of Sub class");
        super.show();   //This will call Super Class's Show method
    }
}