package main;

import java.util.Scanner;

import dao.QuestionDao;
import model.Question;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		QuestionDao questionDao = new QuestionDao();
		String name;
		char operationType;

		System.out.println("****** KickIt CTB Quiz App ******");
		System.out.println("Enter your Name: ");
		name = reader.nextLine();
		System.out.println("Hi there, " + name + "!");

		do {
			System.out.println("1-Start Quiz.\n90-Exit.");
			System.out.print("Enter type of the operation: ");
			operationType = reader.next().charAt(0);

			if (operationType == '0') {
				System.out.println("Exit!");
				reader.close();
				break; 
				
			} else if (operationType == '1') { // Start Quiz
				for (Question question : questionDao.getAll()) {
					System.out.println("\n\nquestion"+question.getId()+":"+question.getQuestion());
					System.out.println("1-"+question.getOption1()+".\n2-"+question.getOption2()+".\n3-"+question.getOption3()+"\n4-"+question.getOption4()+".");
					System.out.print("Your Answer is:");
					char answer = reader.next().charAt(0);
					if(answer == question.getAnswer().charAt(0)) {
						System.out.println("\n==========> Correct!");
					}else {
						System.out.println("\n==========> InCorrect!");
					}
				}

				System.out.println("\n\n[http://localhost:8080/kickit-ctb/question?count="+questionDao.getAll().size()+"&name="+name+"]\n\n");

	        } else {
				System.out.println("Error opertaion doesnt exist!");
				continue;
			}

		} while (true);

		reader.close();       
	}

}
