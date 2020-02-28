
/**
 * Write a description of class Dogs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dogs extends Pets
{
    private String breed;
    
    public Dogs(String n, int a, String b)
    {
        super(n,a);
        breed = b;
    }
    
    public String toString()
    {
        return super.toString() + "Breed : " + breed;
    }
}
