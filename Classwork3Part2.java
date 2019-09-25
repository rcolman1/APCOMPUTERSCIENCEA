
import java.util.Scanner;
public class Classwork3Part2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is your name? ");
    String answer = scan.nextLine();
    
    System.out.println("Hello " + answer + " are you having a good day? ");
    String answer1 = scan.nextLine();
    
    if (answer1.equals("Yes") || answer1.equals("yes"))
    {
        System.out.println("That's good to hear!");
        
        System.out.println("Do you have any siblings? ");
        String answer2 = scan.nextLine();
        
        if (answer2.equals("Yes") || answer2.equals("yes"))
        {
            System.out.println("How many siblings do you have? ");
            double x = scan.nextDouble();
        }
        else if (answer2.equals("No") || answer2.equals("no"))
        {
            System.out.println("Do you have any pets? ");
            String answer3 = scan.nextLine();
        }
        else
        {
            System.out.println("I don't understand what you just input. ");
        }
    
    }
    
    else if (answer1.equals("No") || answer1.equals("no"))
    
    {
        System.out.println("Oh no! I'm sorry to hear that. ");
        
        System.out.println("Do you want to hear a pun? ");
        String answer4 = scan.nextLine();
        if (answer4.equals("yes") || answer4.equals("yes"))
        {
            System.out.println("A teenage boy is getting ready to take his girlfriend to the prom. \n First he goes to rent a tux, but there’s a long tux line at the shop and it takes forever. \n Next, he has to get some flowers, so he heads over to the florist and there’s a huge flower line there. \n He waits forever but eventually gets the flowers. \n Then he heads out to rent a limo. \n Unfortunately, there’s a large limo line at the rental office, but he’s patient and gets the job done. \n Finally, the day of the prom comes. \n The two are dancing happily and his girlfriend is having a great time. \n When the song is over, she asks him to get her some punch, so he heads over to the punch table and there’s no punchline.");
            System.out.println("Do you want to hear a joke?");
            String answer5 = scan.nextLine(); 
                if (answer5.equals("yes") || answer5.equals("Yes"))
                {
                   System.out.println("What needs to be broken before it can be used?");
                    String answer6 = scan.nextLine(); 
               
                        if (answer6.equals("An egg"))
                        {
                            System.out.println("Correct!!!!");
                        }
                        else
                        {
                            System.out.println("You suck");
                        }
                    }      
                else
              
                    System.out.println("You are really having a terrible day.");
                }
        }
        else 
        {
            System.out.println("Ok");
        }
        
     
    
    
    
    
    
    
    
    
    }
  
    
        else
        {
            System.out.println("I don't understand what you just input.");
        }
        
        
       
        
    
    
    }

}
