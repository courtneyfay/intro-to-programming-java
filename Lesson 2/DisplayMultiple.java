import java.util.Scanner;

public class DisplayMultiple
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int age;
      String name;
      
      System.out.println("Enter your name.");
      name = keyboard.nextLine();
      
      System.out.println("Enter your age.");
      age = keyboard.nextInt();
      
      System.out.println("Hello " + name);
      System.out.println("You are " + age + " years old.");
   }
}