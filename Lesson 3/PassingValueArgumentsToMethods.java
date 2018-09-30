public class PassingValueArgumentsToMethods
{
   public static void main(String[] args)
   {
      displayValue(5);
      doubleNumber(4);
   }
   
   public static void displayValue(int num)
   {
      System.out.println("The value is " + num);
   }
   
   public static void doubleNumber(int num)
   {
      //local variable to hold doubled number
      int result;
      
      //multiple value times 2
      result = num * 2;
      
      //print out the result
      System.out.println("The result is " + result);
   }
}