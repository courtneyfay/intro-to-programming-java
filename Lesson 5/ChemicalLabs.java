import java.util.Scanner;

public class ChemicalLabs
{
   public static void main(String[] args)
   {
      // Create a Scanner object for keyboard iput
      Scanner keyboard = new Scanner(System.in);
      
      // Variable to hold the temperature
      double temperature;
      
      // Constant for the maximum temperature
      final double MAX_TEMP = 102.5;
      
      // Get the substance's temperature
      System.out.print("Enter the substance's temperature: ");
      temperature = keyboard.nextDouble();
      
      // If necessary, adjust the thermostat
      while (temperature > MAX_TEMP)
      {
         System.out.println("The temperature is too high.");
         System.out.println("Turn the thermostat down and wait");
         System.out.println("five minutes. Take the temperature");
         System.out.println("again and enter it here: ");
         temperature = keyboard.nextDouble();
      }
      
      // Remind the user to check the temperature
      // again in 15 minutes
      System.out.println("The temperature is acceptable.");
      System.out.println("Check it again in 15 minutes.");
   }
}