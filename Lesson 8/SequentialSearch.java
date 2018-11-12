public class SequentialSearch
{
   public static void main(String[] args)
   {
      //Declare an array to hold test scores
      int[] scores = { 87, 75, 98, 100, 82,
                       72, 88, 92, 60,  78 };
      
      //Declare a Boolean variable to act as a flag.
      boolean found;
      
      //Declare a variable to use as a loop counter.
      int index;
      
      //The flag must initally be set to False.
      found = false;
      
      //Set the counter variable to 0.
      index = 0;
      
      //Step through the array searching for a
      //score equal to 100.
      while (found == false && index < scores.length)
      {
         if (scores[index] == 100)
            found = true;
         else
            index = index + 1;
      }
      
      //Display the search results.
      if (found)
         System.out.println("You earned 100 on test number: " + (index + 1));
         
      else 
         System.out.println("You did not earn 100 on any test.");
   }
}