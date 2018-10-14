import java.util.Scanner;

public class StringEqual
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //A variable to hold a password.
      String password;
      
      //Prompt the user to enter the password.
      System.out.print("Enter the password: ");
      password = keyboard.nextLine();
      
      //Determine whether the correct password
      //was entered.
      if (password.equals("prospero"))
         System.out.print("Password accepted.");
      else
         System.out.print("Sorry, that is not the correct password.");
   }
}