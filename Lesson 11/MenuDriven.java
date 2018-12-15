import java.util.Scanner;

public class MenuDriven
{
   public static void main(String[] args)
   {
      //Declare a variable to hold the
      //user's menu selection.
      int menuSelection;
      
      //Declare variables to hold the units
      //of measurement.
      double inches, centimeters, feet, meters, miles, kilometers;
      
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Display the menu
      System.out.println("1. Convert inches to centimeters.");
      System.out.println("2. Convert feet to meters.");
      System.out.println("3. Convert miles to kilometers.");
      System.out.println();
      
      //Prompt the user for a selection
      System.out.println("Enter your selection: ");
      menuSelection = keyboard.nextInt();
      
      //Validate the menu selection
      while (menuSelection < 1 || menuSelection > 3)
      {
         System.out.println("That is an invalid selection.");
         System.out.print("Enter 1, 2, or 3: ");
         menuSelection = keyboard.nextInt();
      }
      
      //Perform the selected operation.
      switch(menuSelection)
      {
         case 1:
            //Convert inches to centimeters
            System.out.print("Enter the number of inches: ");
            inches = keyboard.nextDouble();
            centimeters = inches * 2.54;
            System.out.println("That is equal to " + centimeters + " centimeters.");
            break;
        
        case 2:
            //Convert feet to meters.
            System.out.print("Enter the number of feet: ");
            feet = keyboard.nextDouble();
            meters = feet * 0.3048;
            System.out.println("That is equal to " + meters + " kilometers.");
            break;
       
        case 3:
            //Convert miles to kilometers.
            System.out.print("Enter the number of miles: ");
            miles = keyboard.nextDouble();
            kilometers = miles * 1.609;
            System.out.println("That is equal to " + kilometers + " kilometers.");
            break;
      }
   }
}