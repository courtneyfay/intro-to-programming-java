//this example is meant to demonstrate local variables and 
//how local scope works
public class LocalVarDemo
{
   public static void main(String[] args)
   {
      //Call the texas method.
      texas();
      
      //Call the california method.
      california();
   }
   
   //Definition of texas method
   public static void texas()
   {
      //local variable named birds
      int birds = 1000;
   
      //display the value of the birds variable
      System.out.println("The texas method has " + birds + " birds.");
   }
   
   //Definition of california method
   public static void california()
   {
      //local variable named birds
      int birds = 200;
      
      //display the value of the birds variable
      System.out.println("The california method has " + birds + " birds.");
   }
}