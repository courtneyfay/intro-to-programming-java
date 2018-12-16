public class DisplayCharacters
{
   public static void main(String[] args)
   {
      //Declare and initialize a new string
      StringBuilder name = new StringBuilder("Jacob");
      
      //Display the individual characters in the string
      System.out.println(name.charAt(0));
      System.out.println(name.charAt(1));
      System.out.println(name.charAt(2));
      System.out.println(name.charAt(3));
      System.out.println(name.charAt(4));
   }
}