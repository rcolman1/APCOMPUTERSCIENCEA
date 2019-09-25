import java.util.Scanner;
public class Classwork4 //Class Header you need curly brackets
{
    public static void main(String[] args) //yellow = method header for main method
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("What is your name? ");
        String answer = scan.nextLine();
        
        
        if (answer.equals("Kelly")|| answer.equals("kelly"))
        {
            System.out.println("Cool name");
        
        }
        else
        { 
            System.out.println("That name is bad");
        
        }
        
        
        
        
    }
}
