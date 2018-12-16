import java.util.Scanner;

public class ChangeCharacters
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Declare a string to hold input.
      String input;
      
      //Declare a variable to step through the string.
      int index;
      
      //Prompt the user to enter a sentence.
      System.out.print("Enter a sentence: ");
      input = keyboard.nextLine();
      
      //Store the string in a StringBuilder object.
      StringBuilder str = new StringBuilder(input);
      
      //Change each "t" to a "d".
      for (index = 0; index < str.length(); index++)
      {
         if (str.charAt(index) == 't')
         {
            str.setCharAt(index, 'd');
         }
      }
      
      //Display the modified string.
      System.out.println(str);
   }
}

