public class DynamicMethodDispatch
{
    public static void main(String[] args) {
        Abc obj = new Xyz();
        obj.show();
        /*
        This will call show of Class Xyz though both classes have show method
        and we are also passing reference of Abc It is so because we are calling constructor of class Xyz
        */
    }
}

class Abc
{
    public void show()
    {
        System.out.println("Show method of class Abc");
    }
}

class Xyz extends Abc
{
    public void show()
    {
        System.out.println("Show method of class Xyz");
    }
}