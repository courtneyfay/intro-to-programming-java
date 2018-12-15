import java.util.Scanner;

public class InheritanceDemo
{
   public static void main(String[] args)
   {
      //Variables to hold user input.
      int questions, missed;
      
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Class variable to reference a FinalExam object.
      FinalExam exam;
      
      //Prompt the user for the number of questions
      //on the exam.
      System.out.print("Enter the numebr of questions on the exam: ");
      questions = keyboard.nextInt();
      
      //Prompt the user for the number of questions
      //missed by the student.
      System.out.print("Enter the number of questions that the " +
                        "student missed: ");
      missed = keyboard.nextInt();
      
      //Create a FinalExam object.
      exam = new FinalExam(questions, missed);
      
      //Display the test results.
      System.out.println("Each question on the exam counts " + exam.getPointsEach() + " points.");
      System.out.println("The exam score is " + exam.getScore());
      System.out.println("The exam score is " + exam.getGrade());
   }
}