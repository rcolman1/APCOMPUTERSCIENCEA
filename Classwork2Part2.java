
import java.util.Scanner;
public class Classwork2Part2
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     
     System.out.println("You have to input 3 values and I will plug it into the quadratic formula and solve for x");
     
     System.out.println("Enter a value for A: ");
     double x = scan.nextDouble(); 
     System.out.println("Enter a value for B: ");
     double y =scan.nextDouble();
     System.out.println("Enter a value for C: ");
     double z = scan.nextDouble();
     
     double quadratic_formula_addition = (-y) + ((Math.sqrt((y*y) - (4*x*z)))/(2*x));
     //double quadratic_formula_subtraction = (-y) - ((Math.sqrt((y*y) - (4*x*z)))/(2*x));
     
     if(quadratic_formula_addition <= 0)
     {
     System.out.println("No real solution");
     
     //System.out.println("This is the value if you add: " + quadratic_formula_positive + ". This is the value if you subtract: " + quadratic_formula_negative);
     
    }
    else if (quadratic_formula_addition == 0)
    {
        System.out.println("One solution");
    }
    else
    {
        System.out.println("Two Solutions");
    }
}
}

