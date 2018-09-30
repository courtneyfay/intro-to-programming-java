public class SimpleMethodDemo
{
   public static void main(String[] args)
   {
      System.out.println("I have a message for you.");
      showMessage();
      System.out.println("That's all folks!");
   }
   //this line is the method header. for now they'll
   //all be public static void
   public static void showMessage()
   {
      System.out.println("Hello World");
   }
}
