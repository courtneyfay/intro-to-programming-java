import java.util.Scanner;

public class ArrayLoop
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Create a constant for the number of employees.
      final int SIZE = 3;
      
      //Declare an array to hold the number of hours
      //worked by each employee.
      int[] hours = new int[SIZE];
      
      //Declare a variable to use in the loops.
      int index;
      
      //Get the hours for each employee.
      for (index = 0; index <= SIZE - 1; index++)
      {
         System.out.print("Enter the hours worked by " + "employee number " + (index + 1) + ": ");
         hours[index] = keyboard.nextInt();
      }
      
      //Display the values entered
      for (index = 0; index <= SIZE - 1; index++)
         System.out.println(hours[index]);
   }
}