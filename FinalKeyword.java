
//  ** THIS  PROGRAM WILL GIVE AN ERROR WHILE TRYING TO RUN IT. THIS IS JUST TO DEMONSTRATE ERRORS.

/*  FINAL KEYWORD
1) Final Variables - Cannot change the value of final variable once assigned
2) Final Method - Any other method cannot override this method
3) Final Class - No class can inherit the final class
 */
public class FinalKeyword
{
    public static void main(String[] args)
    {
        X obj = new X();
        obj.a=5;
        obj.show();
    }
}

final class X
{
    final int a = 9;
    final void show()
    {
        System.out.println("Final Method of class X");
    }
}

class Y extends X
{
    void show()
    {
        System.out.println("Show Method of class Y");
    }
}