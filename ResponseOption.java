/*
* Name : Rahul Ganeshwar Patil
* Date : 09-10-2024
* Description : [This file helps to shorten Quiz Creator as nested options are handled here.]
**/

import java.util.Scanner;
public class ResponseOption {
    static Scanner input = new Scanner(System.in);
    static String option;
    public static void Option_1(Subject[] subjects, int subjectCount) {
        System.out.println(Constant.SHOW_SUBJECTS_OPTION);
        System.out.println(Constant.ADD_SUBJECT_OPTION);
        System.out.println(Constant.EXIT_OPTION);
        System.out.print(Constant.ENTER_OPTION_PROMPT);
        option = input.nextLine();
        switch (option) {
            case "1":
                for (int i = 0; i < subjectCount; i++) {
                    if (subjects[i] != null) {
                        System.out.println("Subject " + (i + 1) + ": " + subjects[i].getName());
                    }
                }
                break;
            case "2":
                System.out.print(Constant.ADD_SUBJECT);
                String subjectName = input.nextLine();
                subjects[subjectCount] = new Subject(subjectName, 100);
                System.out.println(Constant.SUBJECT_ADDED_MESSAGE+ subjectName);
                break;
            case "3":
                System.out.println(Constant.EXIT_MESSAGE);
                return;
            default:
                System.out.println(Constant.INVALID_OPTION_MESSAGE);
                break;
        }
    }

    public static void Option_2() {
        System.out.println(Constant.CHOOSE_SUBJECT_PROMPT);
        System.out.println(Constant.CHOOSE_SUBJECT_OPTION);
        System.out.println(Constant.START_TEST_OPTION);
        System.out.println(Constant.EXIT_TEST_OPTION);
        System.out.print(Constant.ENTER_OPTION_PROMPT);
        option = input.nextLine();
        switch (option) {
            case "1":
				Subject.display();
                break;
            case "2":
				System.out.println(Constant.ENTER_USER_DETAILS);
				String name = input.nextLine();
				String rollNo = input.nextLine();
				User = new UserAccount(name, rollNo);
                QuestionBuilder.generateQuestion();
                break;
            case "3":
                System.out.println(Constant.EXIT_MESSAGE);
                return;
            default:
                System.out.println(Constant.VALID_INPUT_ERROR);
                break;
        }
    }
}
