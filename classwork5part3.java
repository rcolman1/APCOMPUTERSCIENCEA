import java.util.Scanner;
import java.util.Random;

public class classwork5part3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
                System.out.println("How many sides do you want your dice to have? ");
                double xyz = scan.nextDouble();
                
                double ranNum1 = (int)(Math.random()*xyz+1);
                
                
                

        if (xyz <= 0)
        {
            System.out.println("That is an invalid entry");
        }
        else 
        {
            System.out.println("You rolled " + ranNum1);
        }
        
        
        
            }
        }