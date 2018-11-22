public class BinarySearchAlgorithm
{
   //Note: this is not a complete program.
   //
   //The binarySearch method performs a binary search on a
   //String array. The array is searched for the string passed
   //to value. If the string is found, its array subscript 
   //is returned. Otherwise, -1 is returned indicating the
   //value was not found in the array.
   
   public static int binarySearch(String[] array, String value)
   {
      int first;     //first array element
      int last;      //last array element
      int middle;    //mid point of search
      int position;  //position of search value
      boolean found; //flag
      
      //Set the initial values.
      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;
      
      //Search for the value.
      while (!found && first <= last)
      {
         //Calculate mid point
         middle = (first + last) / 2;
         
         //If value is found at midpoint...
         if (array[middle].equals(value))
         {
            found = true;
            position = middle;
         }
         //else if value is in lower half...
         else if (array[middle].compareTo(value))
         {
            last = middle - 1;
         }
         //else if value is in upper half...
         else 
            first = middle + 1;
      }
      
      //Return the position of the item, or -1
      //if it was not found.
      Return position;
   }
}