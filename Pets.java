
/**
 * Write a description of class dogs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pets
{
    private String name;
    private int age;
    
    public Pets(String n, int a)
    {
        name = n;
        age = a;
    }
    
    public String getname()
    {
        return name;
    }
    public void setname(String n)
    {
        name = n;
    }
    public int getage(int a)
    {
        return age;
    }
    public void setage(int a)
    {
        age = a;
    }
    public String toString()
    {
        return "Name: "+  name + " Age: " + age;
    }
}
