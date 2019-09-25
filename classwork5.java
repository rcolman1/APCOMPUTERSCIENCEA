import java.util.Scanner;
import java.util.Random;

public class classwork5
{
    public static void main(String[] args)
    {
       Scanner special_scan = new Scanner(System.in);

       for(int i =0; i < 1; i+=1)
       {
          double randNum1 = (int)(Math.random()*6 +1);
          double randNum2 = (int)(Math.random()*6 +1);
          
          double sum = randNum1 + randNum2;
          System.out.println("Your 2 numbers are " + randNum1 + " and " +randNum2 + " giving you a sum of " +sum );

          if (sum == 7.0 || sum == 11.0)
          {
              System.out.println("Congratulation! You Win");
            }
          else if (sum == 2.0 || sum == 3.0 || sum == 12)
          {
              System.out.println("You lose.");
            }
            else
            {
                System.out.println("Keep playing.");
            }
        
        }
    
        }
       
        } 
  
