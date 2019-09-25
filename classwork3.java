
import java.util.Scanner;
public class classwork3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
     System.out.println("Enter a value for a side length of a prism, and I will give output the volume of the cube.");
     
     
     System.out.println("Side length: ");
     double x = scan.nextDouble();
     
     if (x>0)
     {
        
     
     double volume_of_cube = Math.pow(x,3);
     
     System.out.println("This is your volume: " + volume_of_cube);
     
  
    }
    
    else
    {
    System.out.println("Invalid Entry. ");
    }
  } 
}  


    ///** Objective #1: Write an application to accept a side length for a prism,
        //* //and output the volume of a cube.
        //*
        //* Precondition: The user enters a number for the side length, and not a special character or letter
        //* Postcondition: The program outputs a volume if the user enters a positive number. If the user
        //*     does not enter a positive number, the program responds with "Invalid Input"
        //*/
    
    
    

    ///** Objective #2: Write an application to solve a quadratic equation, which accepts a, b and c
        //* from a user, and outputs one of the solutions to the equation.
        //*/    