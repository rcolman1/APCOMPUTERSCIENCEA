

public class Books
{
    private String title;
    private String author;
    private int pageNumbers;
    
    public Books(String t,String a, int pgNum)
    {
        title = t;
        author = a;
        pageNumbers = pgNum;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public void setAuthor(String a)
    {
        author = a;
    }
    
    public void setpageNumbers(int pgNum)
    {
        pageNumbers = pgNum;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public int getpageNumbers()
    {
        return pageNumbers;
    }
    
    public String toString()
    {
        String bookData= "Title: " + title + "\n Author: " + author + "\n Number of Pages: " + pageNumbers;
        return bookData;
    }
    
    
    
    
}
