import java.util.Scanner;

public class StringArraySearch
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Declare a constant for the array size
      final int SIZE = 6;
      
      //Declare a string array initialized with values
      String[] names = { "Ava Fischer", "Chris Rich",
                         "Gordon Pike", "Matt Hoyle",
                         "Rose Harrison", "Giovanni Ricci" };
      
      //Declare a variable to hold the search value.
      String searchValue;
      
      //Declare a Boolean variable to act as a flag.
      boolean found;
      
      //Declare a counter variable for the array.
      int index;
      
      //The flag must initially be set to False
      found = false;
      
      //Set the counter variable to 0
      index = 0;
      
      //Get the string to search for
      System.out.print("Enter a name to search for in the array: ");
      searchValue = keyboard.nextLine();
      
      //Step through the array searching for
      //the specified name.
      while (found == false && index < names.length)
      {
         if (names[index].equals(searchValue))
            found = true;
         else
            index = index + 1;
      }
      
      //Display the search results
      if (found)
         System.out.println("That name was found in element " + index);
      else
         System.out.println("That name was not found in the array.");
   }
}