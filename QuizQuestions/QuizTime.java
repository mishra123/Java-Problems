package QuizQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QuizTime {

	public static void main(String args[]){
		String ques = null, ans=null;
		int complexity = 0;
		
		Quiz quiz = new Quiz();
		String wait=null;
		List<String> questions = new ArrayList<String>();
		List<String> answers =  new ArrayList<String>();
		List<Integer> complexityLevel =  new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please start entering questions, Please Quit once you are done.....Now press enter to start");
	
		while(sc.hasNextLine()){
			System.out.println("Enter Question:");
			ques = sc.next();
			if(ques.equalsIgnoreCase("Quit")){
				break;
			}
		System.out.println("Enter Answer:");
		ans = sc.next();
		
		System.out.println("Enter complexity level:");
		complexity = sc.nextInt();
		
		questions.add(ques);
		answers.add(ans);
		complexityLevel.add(complexity);
		}
	Iterator it=questions.iterator();
	if(it.hasNext()){
	System.out.println(it.next());
	}
	
		List m = quiz.add(questions, answers, complexityLevel);
		//System.out.println("Size is: "+ m.size());
		quiz.giveQuiz(m);
}

}