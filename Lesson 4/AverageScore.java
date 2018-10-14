import java.util.Scanner;

public class AverageScore
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Declare variables
      double test1, test2, test3, average;
      
      //Get test 1
      System.out.print("Enter the score for test #1: ");
      test1 = keyboard.nextDouble();
      
      //Get test 2
      System.out.print("Enter the score for test #2: ");
      test2 = keyboard.nextDouble();
      
      //Get test 3
      System.out.print("Enter the score for test #3: ");
      test3 = keyboard.nextDouble();
      
      //Calculate the average score.
      average = (test1 + test2 + test3) / 3;
      
      //Display the average.
      System.out.println("The average is " + average);
      
      //If the average is greater than 95,
      //congratulate the user
      if (average > 95)
         System.out.println("Way to go! Great Average!");
   }
}