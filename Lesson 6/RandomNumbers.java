import java.util.Random;

public class RandomNumbers
{
   public static void main(String[] args)
   {
      //Create a Random object. This object will
      //provide us with the random numbers.
      Random randomNumbers = new Random();
      
      //Declare variables.
      int counter, number;
      
      //The following loop displays five random
      //numbers, each in the range of 1 through 100.
      //When we call randomNumbers.nextInt(100) we get a 
      //random number in the range of 0 through 99. We add
      //1 to the value to adjust the range. As a result we
      //get a random number in the range of 1 through 100.
      for (counter = 1; counter <= 5; counter++)
      {
         number = randomNumbers.nextInt(100) + 1;
         System.out.println(number);
      }
   }
}