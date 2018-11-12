import java.util.Scanner;

public class TwoDArray
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Create a 2D array
      final int ROWS = 2;
      final int COLS = 3;
      int[][] values = new int[ROWS][COLS];
      
      //Counter variables for rows and columns
      int row, col;
      
      //Get values to store in the array
      for (row = 0; row <= ROWS - 1; row++)
      {
         for (col = 0; col <= COLS - 1; col++)
         {
            System.out.print("Enter a number: ");
            values[row][col] = keyboard.nextInt();
         }
      }
      
      //Display the values in the array
      System.out.println("Here are the values you entered.");
      for (row = 0; row <= ROWS - 1; row++)
      {
         for (col = 0; col <= COLS - 1; col++)
         {
            System.out.println(values[row][col]);
         }
      }
   }
}