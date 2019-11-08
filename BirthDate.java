
/**
 *@author Rhys Colman
 */
public class BirthDate
{
    private String month;
    private int day;
    private int year;
    
    /**
     * @param mm is month
     * @param dd is day
     * @param yyyy is year
     */
    public BirthDate(String mm, int dd, int yyyy)
    {
        month = mm;
        day = dd;
        year = yyyy;
    }
    
    /**
     * @param mm the month we are changing to
     */
    
    public void setMonth(String mm)
    {
        month = mm;
    }
    
    /**
     * @param dd the day we are changing to
     */
    
    public void setDay(int dd)
    {
        day = dd;
    }
    
    /**
     * @param yyyy the year we are changing to
     */
    
    public void setYear(int yyyy)
    {
        year = yyyy;
    }
    
    /**
     * return month
     */
    
    public String getmm()
    {
        return month;
    }
    
    /**
     * return day
     */
    
    public int getdd()
    {
        return day;
    }
    
    /**
     * return year
     */
    
    public int getyyyy()
    {
        return year;
    }              
    
    public String toString()
    {
        return month + " " + day + " , " + year;
    }
    
    public boolean equals (BirthDate b)
    {
        if (month == b.getmm() && day == b.getdd() && year == b.getyyyy())
            return true;
        return false;
    }
    
    
    
}
