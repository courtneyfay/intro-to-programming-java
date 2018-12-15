public class FinalExam extends GradedActivity
{
   //Fields
   private int numQuestions;
   private double pointsEach;
   private int numMissed;
   
   //The constructor sets the number of
   //questions on the exam and the number
   //of questions missed.
   public FinalExam(int questions, int missed)
   {
      //Local variable to hold the numeric score
      double numericScore;
      
      //the numQuestions and numMissed fields
      numQuestions = questions;
      numMissed = missed;
      
      //Calculate the points for each question
      //and the numeric score for this exam.
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);
      
      //Call the inherited setScore method to
      //set the numeric score
      setScore(numericScore);
   }
   
   //Accessors
   public double getPointsEach()
   {
      return pointsEach;
   }
   
   public int getNumMissed()
   {
      return numMissed;
   }
}