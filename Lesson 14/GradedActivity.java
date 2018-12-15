public class GradedActivity
{
   //The score field holds a numeric score.
   private double score;
   
   //Mutator
   public void setScore(double s)
   {
      score = s;
   }
   
   //Accessor
   public double getScore()
   {
      return score;
   }
   
   //getGrade method
   public String getGrade()
   {
      //Local variable to hold a grade.
      String grade;
      
      //Determine the grade.
      if (score >= 90)
         grade = "A";
      else if (score >= 80)
         grade = "B";
      else if (score >= 70)
         grade = "C";
      else if (score >=60)
         grade = "D";
      else
         grade = "F";
      
      //Return the grade
      return grade;
   }
}