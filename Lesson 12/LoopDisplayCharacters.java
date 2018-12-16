public class LoopDisplayCharacters
{
   public static void main(String[] args)
   {
      //Declare and initialize a new string.
      StringBuilder name = new StringBuilder("Jacob");
      
      //Declare a variable to step through the string.
      int index;
      
      //Display the individual characters in the string.
      for (index = 0; index < name.length(); index++)
         System.out.println(name.charAt(index));
   }
}