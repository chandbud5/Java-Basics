/*
Polymorphism - Same Thing having different behaviour under under different circumstances
1)  Method Overloading
2)  Method Overriding
3)  Constructor Overloading
 */
public class Polymorphism
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        System.out.println(s1.toString()+"\n");

        Student s2 = new Student(2);
        System.out.println(s2.toString()+"\n");

        Student s3 = new Student(3,"Chand");
        System.out.println(s3.toString()+"\n");

        s1.show();
        s1.show(4);
    }
}
class Student
{
    int rollno;
    String name;

    public Student()
    {
        System.out.println("Default Constructor Rollno and Name are NULL");
    }
    public Student(int i)
    {
        this.rollno = i;
        System.out.println("Rollno = "+ i + " Name is NULL ");
    }
    public Student(int i,String s)  //Constructor Overloading
    {
        this.rollno = i;
        this.name = s;
        System.out.println("Rollno is "+i+" Name is "+s);
    }

    @Override   // <- This is called annotation || and here toString method is overrided
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", name='" + name + "'" +"}";
    }

    public void show()
    {
        System.out.println("Show method with no parameter");
    }

    //  This is method overloading
    public void show(int i)
    {
        System.out.println("Show method with one parameter");
    }
}
