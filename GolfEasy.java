
/**
 * Write a description of class poker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GolfEasy
{
    private int par;
    private int playerScore;
    
    public GolfEasy(int p, int score)
    {
        par = p;
        playerScore = score;
    }
    public int getPar()
    {
        return par;
    }
    public int getplayerScore()
    {
        return playerScore;
    }
    public void setPar(int p)
    {
        par = p;
    }
    public void setplayerSccore(int score)
    {
        playerScore = score;
    }
    public String toString()
    {
        int difference = playerScore - par;
        if(difference == 0)
        return "Par";
        else if(difference == -1)
        return "Birdie";
        else if(difference == -2)
        return "Eagle";
        else if(difference == 1)
        return "Bogey";
        else if (difference == 2)
        return "Double Bogey";
        else
        return "";
    }
}
