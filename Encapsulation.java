// Encapsulation says to set and get the values of variables
// you should use methods ( getters and setters )

public class Encapsulation
{
    public static void main(String[] args)
    {
        Variables v = new Variables();
        v.setI(5);
        System.out.println(v.getI());
    }
}

class Variables
{
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}