import java.util.Scanner;

public class PassArgument
{
   public static void main(String[] args)
   {
   
      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Declare a variable to hold a number.
      int number;
      
      // Prompt the user for a number
      System.out.println("Enter a number and I will display"); 
      System.out.println("that number doubled.");
      
      // Read an integer from the keyboard.
      number = keyboard.nextInt();
      
      // Call the doubleNumber method passing
      //number as an argument.
      doubleNumber(number);
   }
   
   public static void doubleNumber(int value)
   {
      // Local variable to hold the result
      int result;
      
      // Multiply the value parameter times 2.
      result = value * 2;
      
      // Display the result.
      System.out.println(result);
   }
}