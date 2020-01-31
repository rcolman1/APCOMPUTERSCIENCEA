import java.util.*;
/**
 * Write a description of class SPRINGCLASSWORK2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SPRINGCLASSWORK2
{
    public static void main(String[] args)
    {
        ArrayList<String> sports = new ArrayList<String> ();
        sports.add("Softball");
        sports.add("Soccer");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Soccer");
        sports.add("Skiing");
        sports.add("Rowing");
        
        printElement(sports);
        insertElement(sports, "Football");
        printElement(sports);
        System.out.print(returnElement(sports, 3));
        removeThirdElement(sports);
        System.out.print(searchForElement(sports, "Soccer"));
        System.out.print(searchAndCountElement(sports, "Soccer"));
        printElement(copyAndReturnList(sports));
        shuffleElements(sports);
        reverseElements(sports);
        
    }
    
    public static void printElement(ArrayList<String> inList)
    {
        for(int i= 0; i< inList.size(); i++)
            System.out.println(inList.get(i));
    }
    
    public static void insertElement(ArrayList<String> inList, String a)
    {
     inList.add(0, a);
    }
    
    public static String returnElement(ArrayList<String> inList, int i)
    {
        return inList.get(i);
    }
    
    public static void removeThirdElement(ArrayList<String> inList)
    {
        inList.remove(2);
        for(int i = 0; i < inList.size(); i++)
        System.out.println(inList.get(i));
    }
    
    public static int searchForElement(ArrayList<String> inList, String a)
    {
        return inList.indexOf(a);
    }
    
    public static int searchAndCountElement(ArrayList<String> inList, String a)
    {
        int count = 0;
        for(int i = 0; i<inList.size(); i ++)
        { if(inList.get(i).equals(a))
            count++;
        }
        return count;
    }
    
    public static ArrayList<String> copyAndReturnList(ArrayList<String> inList)
    {
        ArrayList<String> copy = new ArrayList<String>();
        for(int i = 0; i<inList.size(); i++)
        {copy.add(inList.get(i)); }
        return copy;
    }
    
    public static void shuffleElements(ArrayList<String>inList)
    {
        Collections.shuffle(inList);
        for(int i = 0; i<inList.size(); i++)
        System.out.println(inList.get(i));
    }
    
    public static void reverseElements(ArrayList<String> inList)
    {
        Collections.reverse(inList);
        for( int i = 0; i<inList.size(); i++)
        System.out.println(inList.get(i));
    }
}
    
    
