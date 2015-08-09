package QuizQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Quiz{


	Question question;
	Question answer;
	String justEnter;
	String candidateAnswer;
	Scanner sc = new Scanner(System.in);
	
		
		public List add(List ques, List ans, List complexity){
			List list = new ArrayList();
			Iterator itQues = ques.iterator();
		Iterator itAns = ans.iterator();
		Iterator itComplex = complexity.iterator();
		for(int i=0;i<ans.size();i++){
		question = new Question(ques.get(i).toString(), ans.get(i).toString());
		question.setComplexity(Integer.parseInt(complexity.get(i).toString()));
		list.add(question);
		}
	//	System.out.println("Question is been added");
		return list;
	}
	
	public void giveQuiz(List<Question> m){
		for(Question l:m){
	System.out.println("Question is" + l.getQuestion());
			Scanner sc = new Scanner(System.in);
	candidateAnswer = sc.next();
	System.out.println(l.answerCorrect(candidateAnswer));
	}
		System.out.println("Thanks for attending the quiz!");
	}
	public void giveQuiz(int min, int max){
		if(question.getComplexity()>=min && question.getComplexity()<=max){
			System.out.println(question.getQuestion());
			candidateAnswer = sc.next();
			boolean correct = question.answerCorrect(candidateAnswer);
			if(correct){
				System.out.println("Right answer");
			}
			else{
				System.out.println("Wrong answer");
			}
		}
	}
}
