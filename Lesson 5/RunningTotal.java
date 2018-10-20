import java.util.Scanner;

public class RunningTotal
{
   public static void main(String[] args)
   {
      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Declare a variable to hold each number
      // entered by the user.
      int number;
      
      // Declare an accumulator variable,
      // initialized with 0.
      int total = 0;
      
      // Declare a counter variable for the loop
      int counter;
      
      // Explain what we are doing
      System.out.println("This program calculates the");
      System.out.println("total of five numbers.");
      
      // Get five numbers and accumulate them
      for (counter = 1; counter <= 5; counter++)
      {
         System.out.println("Enter a number: ");
         number = keyboard.nextInt();
         total = total + number;
      }
      
      // Display the total of the numbers.
      System.out.println("The total is " + total);
   }
}