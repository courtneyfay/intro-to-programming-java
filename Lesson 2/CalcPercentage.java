import java.util.Scanner;

public class CalcPercentage
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double originalPrice, discount, salePrice;
      
      System.out.print("Enter the item's original price: ");
      originalPrice = keyboard.nextDouble();
      
      discount = originalPrice * 0.2;
      salePrice = originalPrice - discount;
      
      System.out.println("The sale price is $" + salePrice);
   }
}