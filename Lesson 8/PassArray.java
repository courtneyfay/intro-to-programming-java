public class PassArray
{
   public static void main(String[] args)
   {
      //A constant for the array size
      final int SIZE = 5;
      
      //An array initialized with values
      int[] numbers = { 2, 4, 6, 8, 10 };
      
      //A variable to hold the sum of the elements
      int sum;
      
      //Get the sum of the elements
      sum = getTotal(numbers);
      
      //Display the sum of the array elements.
      System.out.println("The sum of the array elements is " + sum);
   }
   
   //The getTotal function accepts an Integer array, and the 
   //array's total size as arguments. It returns the total of the
   //array elements.
   public static int getTotal(int[] array)
   {
      //Loop counter
      int index;
      
      //Accumulator, initialized to 0
      int total = 0;
      
      //Get each test score
      for (index = 0; index < array.length; index++)
      {
         total = total + array[index];
      }
      
      return total;
   }
}