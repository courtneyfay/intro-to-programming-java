import java.util.Scanner;

public class UpperCaseCounter
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Declare a string to hold input.
      String input;
      
      //Declare a variable to step through the string.
      int index;
      
      //Declare an accumulator variable to keep count
      //of the number of uppercase letters.
      int upperCaseCount = 0;
      
      //Prompt the user to enter a sentence.
      System.out.print("Enter a sentence: ");
      input = keyboard.nextLine();
      
      //Store the string in a StringBuilder object.
      StringBuilder str = new StringBuilder(input);
      
      //Count the number of uppercase letters.
      for (index = 0; index < str.length(); index++)
      {
         if (Character.isUpperCase(str.charAt(index)))
         {
            upperCaseCount = upperCaseCount + 1;
         }
      }
      
      //Display the number of uppercase characters.
      System.out.println("That string has " + upperCaseCount + " uppercase letters.");
   }
}