public class BubbleSortAlgorithm
{
   //Note: This is not a complete program
   //
   //The bubble sort method uses the bubble sort algorithm
   //to sort an int array.
   //Note the following:
   // (1) We do not have to pass the array size because in
   //     Java arrays have a length field.
   // (2) We do not have a separate method to swap values.
   //     This is because Java does not allow pass by
   //     reference. The swap is performed inside this method.
   
   public static void bubbleSort(int[] array)
   {
      int maxElement;   //Marks the last element to compare
      int index;        //Index of an element to compare
      int temp;         //Used to swap two elements
      
      //The outer loop positions maxElement at the last element
      //to compare during each pass through the array. Initially
      //maxElement is the index of the last element in the array.
      //During each iteration, it is decreased by one.
      for (maxElement = array.length - 1; maxElement >= 0; maxElement--)
      {
         //The inner loop steps through the array, comparing
         //each element with its neighbor. All of the elements
         //from index 0 through maxElement are involved in the
         //comparison. If two elements are out of order, they
         //are swapped.
         for (index = 0; index <= maxElement; index++)
         {
            //Compare an element with its neighbor.
            if (array[index] > array[index + 1])
            {
               //Swap the two elements.
               temp = array[index];
               array[index] = array[index + 1];
               array[index + 1] = temp;
            }
         }
      }
   }
}