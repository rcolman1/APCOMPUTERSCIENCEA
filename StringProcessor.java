
public class StringProcessor
{
    public static String withoutEnds(String str) //FIRST EXAMPLE
    {
       return str.substring(1,str.length()-1);
     
    }
    
    public static String front2(String str) //SECOND EXAMPLE
    {
        int length = str.length();
        return str.substring(length-2,length) + str.substring(0,length-2);
    
    }
    
    public static String firstFour(String str) //THIRD EXAMPLE
        {
           int length = str.length();
            
           if (length>=4)
           return str.substring(0,4);
           else if (length == 3)
           return (str.substring(0) + "#");
           else if (length == 2)
           return(str.substring(0) + "##");
           else if (length == 1)
           return (str.substring(0) + "###");
           else
           return ("####");
            
    }
    
    public static String frontAgain(String str) //FOURTH EXAMPLE
    {
        int length = str.length();
        if (str.substring(0,2).equals(str.substring(length-2,length)))
        return "true";
        else
        return "false";
    }
    
}
