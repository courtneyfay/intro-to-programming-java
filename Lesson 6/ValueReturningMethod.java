import java.util.Scanner;

public class ValueReturningMethod
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Local variables
      int firstAge, secondAge, total;
      
      //Get the user's age and the user's
      //best friend's age.
      System.out.print("Enter your age: ");
      firstAge = keyboard.nextInt();
      System.out.print("Enter your best friend's age: ");
      secondAge = keyboard.nextInt();
      
      //Get the sum of both ages
      total = sum(firstAge, secondAge);
      
      //Display the sum
      System.out.print("Together you are " + total + " years old.");
   }
   
   //The sum function accepts two int arguments and
   //returns the sum of those arguments as an int.
   public static int sum(int num1, int num2)
   {
      int result;
      result = num1 + num2;
      return result;
   }
}