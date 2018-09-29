import java.util.Scanner;

public class GetAge
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int age;
      
      System.out.println("What is your age?");
      age = keyboard.nextInt();
      System.out.println("Here is the value that you entered:");
      System.out.println(age);
   }
}