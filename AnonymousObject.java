/* ANONYMOUS OBJECTS
-> This objects can only be used once
-> This object will not have any reference in Stack memory.
It will be just stored in Heap memory. So GC (garbage collector) can easily clean it as
there is no reference in Stack memory.
*/
public class AnonymousObject
{
    public static void main(String[] args)
    {
        // To create Anonymous object
        new Demo().view();
        // It can be used when you need to create object that is to be used only once
    }
}
class Demo
{
    public void view()
    {
        System.out.println("View method from class Demo");
    }
}