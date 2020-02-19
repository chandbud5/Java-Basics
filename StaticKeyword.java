/*
Topics to cover
1) Static import
2) Static Block
3) Static Method and Variable
 */

import static java.lang.System.out;  //Static import

public class StaticKeyword
{
    public static void main(String[] args) throws Exception
    {
        out.println("Hello World"); // Due to static import we do not need to write whole syso
        Class c = Class.forName("B");   // forName method is used to load class

        B.j = 5;    // Accessing static variable
        B.show();   //Calling Show method don't require obj
    }
}
class B
{
    static  int j;  // Static Variable
    static  //  Static Block
    {
        System.out.println("This is static block which will be executed when class is loaded");
    }
    public static void show()
    {
        out.println("Show from class B");
    }
}