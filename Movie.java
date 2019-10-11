
/**
 * Write a description of class Movie here.
 *
 *RHYS COLMAN
 * @version (a version number or a date)
 */
public class Movie
{
    //instance variables are the adjectives to describe your object
    private String title;
    private String genre;
    private double lengthInMin;
    
    //consttructor definition
    public Movie(String titl, String gen, double len)
    {
        title = titl;
        genre = gen;
        lengthInMin = len;
    }
    
    //mutator method for changing private data
    public void setTitle(String t)
    {
        title = t; 
    } 
    
    //accessor method lets you get/return the title that is private
    public String getTitle()
    {
        return title;
    }
    
    public void setGenre(String g)
    {
        genre = g;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public void setlengthInMin(double l)
    {
        lengthInMin = l;
    }
    
    public double getlengthInMin()
    {
        return lengthInMin;
    }
    
}
