import java.util.Scanner;
public class Classwork2
{
  public static void main(String[]args)
  {
    // Step 1: Construct a scanner object for reading keyboard input
    Scanner special_scan = new Scanner(System.in);
  
    // Step 2: Give the user a prompt with a print statement
    System.out.println("Enter your age: ");
    
    // Step 3: Declare a variable to store user input and use scan.nextDouble() to read the input
    double users_age = special_scan.nextDouble();
    
    double rhys_colman_age = 17;
    
    double age_comparison = rhys_colman_age/users_age;
    
    System.out.println("Rhys is " + age_comparison + " times your age");
    
 
   
}
}