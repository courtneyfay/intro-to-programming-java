import java.util.Scanner;

public class ArrayInput
{
   public static void main(String [] args)
   {
      //Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Create a constant for the number of employees
      int SIZE = 3;
      
      //Declare an array to hold the number of hours
      //worked by each employee
      int[] hours = new int[SIZE];
      
      //Get the hours worked by employee 1.
      System.out.print("Enter the hours worked by employee 1: ");
      hours[0] = keyboard.nextInt();
      
      //Get the hours worked by employee 2.
      System.out.print("Enter the hours worked by employee 2: ");
      hours[1] = keyboard.nextInt();
      
      //Get the hours worked by employee 3.
      System.out.print("Enter the hours worked by employee 3: ");
      hours[2] = keyboard.nextInt();
      
      //Display the values entered.
      System.out.println("The hours you entered are: ");
      System.out.println(hours[0]);
      System.out.println(hours[1]);
      System.out.println(hours[2]);
   }
}