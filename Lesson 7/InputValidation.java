import java.util.Scanner;

public class InputValidation
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Local variable
      String doAnother;
      
      do
      {
         //Calculate and display a retail price
         showRetail();
         
         //Do this again?
         System.out.print("Do you have another item? (Enter y for yes): ");
         doAnother = keyboard.next();
      } while (doAnother.equals("y") || doAnother.equals("Y"));
   }
   
   //The showRetail module gets an item's wholesale cost
   //from the user and displays its retail price.
   public static void showRetail()
   {
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Local variables
      double wholesale, retail;
      
      //Constant for the markup percentages
      final double MARKUP = 2.5;
      
      //Get the wholesale cost
      System.out.print("Enter an item's wholesale cost: ");
      wholesale = keyboard.nextDouble();
      
      //Validate the wholesale cost
      while (wholesale < 0)
      {
         System.out.println("The cost cannot be negative. Please");
         System.out.print("enter the correct wholesale cost: ");
         wholesale = keyboard.nextDouble();
      }
      
      //Calculate the retail price
      retail = wholesale * MARKUP;
      
      //Display the retail price
      System.out.println("The retail price is $" + retail);
   }
}