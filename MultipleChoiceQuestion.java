/***
 * This file contain MultipleChoiceQuestion in which we display Question and option

 * Program_owner : Kalpana Swami
 * Date : 07 October 2024
 */
 
 interface Question {
    void display(String userAnswer);
    boolean isValidAnswer(String userAnswer);
}
public abstract class MultipleChoice implements Question{
    protected String questionText;
    protected String[] options;

    public Question(String questionText, String[] options) {
        this.questionText = questionText;
        this.options = options;
    }

    public abstract void display();
    public abstract boolean isValidAnswer(String userAnswer);
}

public class MultipleChoiceQuestion extends MultipleChoice{
     String Question;
     String Options[];
     String Answer;
     String UserAnswer;
    //Display function is only displaying the Question and Options
    // Parameter : String
    // Return_type : No Return Type
     public void display(String Question , String[] Options, int i ) {
         this.Question = Question;
         this.Options[] = Options[];
         System.out.println(Question);
		 System.out.println(Options[i]);
     }
    //ValidAnswer function is used to check the Answer is correct or not
    // Parameter : String
    // Return_type : Boolean
     public boolean isvalidAnswer(String Answer, String UserAnswer){
         this.Answer = Answer;
         this.UserAnswer = UserAnswer;
         return Answer.equalsIgnoreCase(UserAnswer);
     }

}
