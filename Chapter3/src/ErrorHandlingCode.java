import java.util.Scanner;

public class ErrorHandlingCode {
	public static void main(String[] args) 
	{	Scanner input = new Scanner(System.in); 
		System.out.println("Welcome to Error Handling Sandbox!");
		
		String Question = "Placeholder";
		
		boolean QuestionCheck = true; //Error Handling
		while (QuestionCheck) {
			
			System.out.print("\n" + "1. [Option 1]\n" + "2. [Option 2]\n" + "3. [Option 3]\n" + "4. [Option 4]\n\n" + "What would you like to do: ");
			Question = input.nextLine();
			QuestionCheck = !Question.equals("1") && !Question.equals("2") && !Question.equals("3") && !Question.equals("4");
		} 
		
		System.out.print("\n");
		
		if (Question.equals("1")) {
				System.out.println("[Option 1]");}
		
		else if (Question.equals("2")) {
			System.out.println("[Option 2]");}
		
		else if (Question.equals("3")) {
			System.out.println("[Option 3]");}
		
		else if (Question.equals("4")) {
			System.out.println("[Option 4]");}
	}
}
