import java.util.Scanner;

public class NestedIf
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //A variable to hold the temperature.
      int temp;
      
      //Prompt the user to enter the temperature.
      System.out.print("What is the outside temperature? ");
      temp = keyboard.nextInt();
      
      //Determine the type of weather we're having.
      if (temp < 30)
         System.out.println("Wow! That's cold!");
      else
      {
         if (temp < 50)
            System.out.println("A little chilly.");
         else
         {
            if (temp < 80)
               System.out.println("Nice and warm.");
            else
               System.out.println("Whew! It's hot!");
         }
      }
   }
}