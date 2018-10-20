import java.util.Scanner;

public class ForLoop3
{
   public static void main(String[] args)
   {
      // Declare a counter variable
      int counter;
      
      // Constant for the maximum value
      final int MAX_VALUE = 11;
      
      for (counter = 1; counter <= MAX_VALUE; counter = counter + 2)
      {
         System.out.println(counter);
      }
   }
}