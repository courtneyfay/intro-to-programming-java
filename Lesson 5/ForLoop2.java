public class ForLoop2
{
   public static void main(String[] args)
   {
      // Variables
      int counter, square;
      
      // Constant for the maximum value
      final int MAX_VALUE = 10;
      
      // Display table headings
      System.out.println("Number\tSquare");
      System.out.println("----------------------");
      
      // Display the numbers 1 through 10 and
      // their squares.
      for (counter = 1; counter <= MAX_VALUE; counter++)
      {
         square = counter * counter;
         System.out.println(counter + "\t\t" + square);
      }
   }
}