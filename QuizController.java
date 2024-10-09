/*
* Name : Rahul Ganeshwar Patil
* Date : 08-10-2024
* Descripton : [This file manages Quiz. It Displays questions, options and update score according to the correct answer.]
*/

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizController {
    private int score = 0;
    private Scanner input = new Scanner(System.in);
	private MultipleChoiceQuestion MCQ = new MultipleChoiceQuestion();
	private QuestionBuilder questionSet = new QuestionBuilder();
    private Question[] questions;
	private Options[] options;
    private UserAccount user;
	
    public QuizController(Question[] questions,Options[] options ,User user) {
        this.questions = questions;
        this.user = user;
    }
	
    public void addScore(String userChoice) {
        if (MCQ.isValidAnswer(userChoice)) {
            score++;
            return;
        } else {
            score -= 2;
            return;
        }
    }
	
    public void displayScore() {
        System.out.println(Constant.SCORE_DISPLAY_MESSAGE ,user.getName() , user.getScore(), questions.length);
    }
	
    public void conductQuiz() {
        for (int i = 0; i < questionSet.numberOfQuestions; i++ ) {
            MCQ.display(questionSet.question[i],questionSet.options[],i);            
            System.out.println(Constant.PROMPT_ENTER_OPTION);
            String userAnswer = input.nextLine();
			if (!isValidInput(userAnswer)) {
                System.err.println(Constant.VALID_INPUT_ERROR);
            } 
			else if (userChoice.equalsIgnoreCase("submit")) {
				System.out.println(Constant.SUBMITTING_MESSAGE);
				user.setScore(score);
				displayScore();
        } 
			else{
				addScore(userAnswer);
			}            
        }
    }
	
	private boolean isValidInput(String input) {
        return input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B") || 
               input.equalsIgnoreCase("C") || input.equalsIgnoreCase("D") || 
               input.equalsIgnoreCase("submit");
    }
}