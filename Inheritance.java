/*
 -> Super Class Sub Class Relationship
 -> Types of inheritance
    1) Single Level Inheritance   A -> B
    2) Multi Level Inheritance  A -> B -> C
    3) Multiple inheritance A,B -> C
 -> Multiple inheritance not supported by java
 */

public class Inheritance
{
    public static void main(String[] args)
    {
        sub obj = new sub();
        obj.method1();  //Single level inheritance
        obj.method2();

        sub2nd obj1 = new sub2nd();
        obj1.method3();
        obj1.method1(); //Multi level inheritance
    }
}

class sup
{
    void method1()
    {
        System.out.println("Method1 from Super class");
    }
}

class sub extends sup   //  sup -> sub
{
    void method2()
    {
        System.out.println("Method2 from Sub class");
    }
}

class sub2nd extends sub    // sub -> sub2nd equivalent to sup -> sub -> sub2nd
{
    void method3()
    {
        System.out.println("Method3 from sub2nd class");
    }
}