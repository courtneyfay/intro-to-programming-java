import java.util.Scanner;

public class GetInput
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String name;
      double payRate;
      int hours;
      
      System.out.println("Enter your name: ");
      name = keyboard.nextLine();
      
      System.out.println("Enter your hourly pay rate: ");
      payRate = keyboard.nextDouble();
      
      System.out.println("Enter the number of hours you work per week: ");
      hours = keyboard.nextInt();
      
      System.out.println("Here are the values that you entered: ");
      System.out.println(name);
      System.out.println(payRate);
      System.out.println(hours);
   }
}