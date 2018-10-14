import java.util.Scanner;

public class DualAlternative
{
   //Globally visible constants.
   public final static int BASE_HOURS = 40;
   public final static double OT_MULTIPLIER = 1.5;
   
   public static void main(String [] args)
   {
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Declare local variables
      double hoursWorked, payRate, grossPay;
      
      //Get the number of hours worked.
      System.out.print("Enter the number of hours worked: ");
      hoursWorked = keyboard.nextInt();
      
      //Get the hourly pay rate.
      System.out.print("Enter the hourly pay rate: ");
      payRate = keyboard.nextDouble();
      
      //Calculate the gross pay
      if (hoursWorked > BASE_HOURS)
         grossPay = calcPayWithOT(hoursWorked, payRate);
      else
         grossPay = calcRegularPay(hoursWorked, payRate);
         
      //Display the gross pay
      System.out.println("The gross pay is $" + grossPay);
   }
   
   //The calcPayWithOT function calculates pay
   //with overtime and returns that value.
   public static double calcPayWithOT(double hours, double rate)
   {
      //local variables
      double overtimeHours, overtimePay, gross;
      
      //Calculate the number of overtime hours.
      overtimeHours = hours - BASE_HOURS;
      
      //Calculate the overtime pay.
      overtimePay = overtimeHours * rate * OT_MULTIPLIER;
      
      //Calculate the gross pay.
      gross = BASE_HOURS * rate + overtimePay;
      
      return gross;
   }
   
   //The calcRegularPay module calculates
   //pay with no overtime and returns that value.
   public static double calcRegularPay(double hours, double rate)
   {
      return hours * rate;
   }
}