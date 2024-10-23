package quiz;
import java.util.*;
import user.*;
import question.*;
import result.*;
public class Main {

	public static void main(String[] args) {
//		User user = new Student("Ayush");
//		String[] opt1 = {"hello", "sdfsdf","sdsdf","sdfsf"}; 
//		Question question1 = new Question("What is Your name", opt1, "1");
//		Score score1 = new Score(question1, "1");
//		String[] opt2 = {"hello", "sdfsdf","sdsdf","sdfsf"}; 
//		Question question2 = new Question("What is Your name", opt2, "2");
//		Score score2 = new Score(question2, "2");
//		String[] opt3 = {"hello", "sdfsdf","sdsdf","sdfsf"}; 
//		Question question3 = new Question("What is Your name", opt3, "3");
//		Score score3 = new Score(question3, "3");
//		int result = score1.getScore() + score2.getScore() + score3.getScore();
//		System.out.println(result);
		String[] questionTexts = new String[5];
		String[][] options = new String[5][4];
		String[] answer = new String[5];
		Scanner input = new Scanner(System.in);
		int questionNumber = 5;
		Student[] studentArray = new Student[5];
		int index = 0;
		for(int i = 0; i < questionNumber; i++){
			System.out.println("Enter question " + (i+1) + " : ");
			questionTexts[i] = input.nextLine();
			for(int j = 0; j < 4; j++) {
				System.out.println("Enter option " + (j+1) + " : ");
				options[i][j] = input.nextLine();
			}
			System.out.println("Enter Correct answer(1-4) : ");
			answer[i] = input.next();
			input.nextLine();
		}
		
		while(true) {
			int result = 0;
			System.out.println("Do you want to attempt the quiz\nEnter 1 to attempt else enter 0");
			String choice = input.next();
			if(choice.equals("1")) {
				input.nextLine();
				System.out.println("Enter your name: ");
				String userName = input.nextLine();
			    Student student = new Student(userName);
			    studentArray[index] = student;
				index++;
				for(int i = 0; i < questionNumber; i++){			
					Question question = new Question(questionTexts[i],options[i],answer[i]);
					System.out.println(question);
					String userAnswer = input.next();
					Score score = new Score(question,userAnswer);
					result += score.getScore();
					student.setResult(result);				
				}
				System.out.println("Your test is submitted : \n" + student);
			}
			else{
				System.out.println("THANK YOU");
				return;
			}
		}
		
	}

}
