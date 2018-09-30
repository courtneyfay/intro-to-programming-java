public class MultipleArgs
{
   public static void main(String[] args)
   {
      System.out.println("The sum of 12 and 45 is: ");
      showSum(12, 45);
   }
   public static void showSum(int num1, int num2)
   {
      int sum;
      
      sum = num1 + num2;
      System.out.println(sum);
   }
}