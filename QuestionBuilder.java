/*
* Name : Gulshan and Ayush
* Date : 07-10-2024
* Description : [This file is used to Build Question Set in any Subject.]
*/

import java.util.*;

public class QuestionBuilder {
    static String[] questionsArray;
    static String[][] optionsArray;
    static int[] answerArray;
    static int numberOfQuestion = 0;
    static String questionInput;
    static String optionInput;
    static int answerInput;
    static boolean ifInteger = false;
    static boolean checkEmptyQuestion = false;
    static Scanner input = new Scanner(System.in);

    public static void generateQuestion() {
        while (ifInteger != true){
            System.out.println(Constant.PROMPT_NUMBER_OF_QUESTIONS);
            numberOfQuestion = QuizEntry.isValidInteger();
        }
        input.nextLine();
        questionsArray = new String[numberOfQuestion];
        optionsArray = new String[numberOfQuestion][4];
        answerArray = new int[numberOfQuestion];
        for(int i = 0; i < numberOfQuestion; i++){
              checkEmptyQuestion = false;
              while (checkEmptyQuestion != true){
                 System.out.println(Constant.PROMPT_ENTER_QUESTION, (i+1) );
                 questionInput = input.nextLine();
                 QuizEntry.storeQuestionIntoQuestionsArray(questionInput,i);
                 if(questionsArray[i] == ""){
                     System.out.println(Constant.ERROR_EMPTY_QUESTION);
                     checkEmptyQuestion = false;
                }
                 else checkEmptyQuestion = true;
            }
              checkEmptyQuestion = false;
              for(int j = 0; j < 4; j++){
                 boolean optionEmptyCheck = false;
                 while (optionEmptyCheck != true){
                    System.out.println(Constant.PROMPT_ENTER_OPTION);
                    optionInput = input.nextLine();
                    if(optionInput == ""){
                        System.out.println(Constant.ERROR_EMPTY_OPTION);
                        optionEmptyCheck = false;
                    }
                    else optionEmptyCheck = true;
                }
                QuizEntry.storeOptionIntoOptionsArray(optionInput, i, j);
            }
            boolean validAnswerOption = false;
            while ( validAnswerOption!= true){
                ifInteger = false;
                System.out.println(PROMPT_CORRECT_OPTION);
                answerInput = QuizEntry.isValidInteger();
                if(ifInteger == true){
                    if(answerInput >=1 && answerInput <= 4){
                        QuizEntry.storeAnswerIntoAnswerArray(answerInput, i);
                        validAnswerOption = true;
                    }
                    else System.out.println(ERROR_INVALID_INPUT);
                }

            }
            input.nextLine();

        }
        System.out.println(Constant.THANK_YOU_MESSAG);
        System.out.println(Constant.QUIZ_READY_MESSAGE);
    }

    // main end

    public static int isValidInteger(){
        try {
            int integerInput = input.nextInt();
            ifInteger = true;
            return integerInput;
        }
        catch (Exception exception){
            System.out.println(Constant.VALID_INPUT_ERROR);
            input.nextLine();
        }
        return 0;
    }

    public static void storeQuestionIntoQuestionsArray(String question,int index){
        questionsArray[index] = question;
    }
    public static void storeOptionIntoOptionsArray(String option, int index1, int index2){
        optionsArray[index1][index2] = option;
    }
    public static void storeAnswerIntoAnswerArray(int answer, int index){
        answerArray[index] = answer;
    }
}