import java.util.Scanner;

public class GradeCalculator5Classes 
{

	public static void main(String[] args) 
	{	
		
		Scanner input = new  Scanner(System.in);
	
		System.out.print("Enter your first class: ");
		String Class1 = input.next();
		System.out.print("Enter your mark for this class: ");
		int Grade1 = input.nextInt();
		System.out.print("Enter your second class: ");
		String Class2 = input.next();
		System.out.print("Enter your mark for this class: ");
		int Grade2 = input.nextInt();
		System.out.print("Enter your third class: ");
		String Class3 = input.next();
		System.out.print("Enter your mark for this class: ");
		int Grade3 = input.nextInt();
		System.out.print("Enter your fourth class: ");
		String Class4 = input.next();
		System.out.print("Enter your mark for this class: ");
		int Grade4 = input.nextInt();
		System.out.print("Enter your fifth class: ");
		String Class5 = input.next();
		System.out.print("Enter your mark for this class: ");
		int Grade5 = input.nextInt();
		
		
		System.out.println("\n\n");
		System.out.format("%-9s %9s", "Class", "Grades\n");
		System.out.format("%-9s %9s", Class1, Grade1 + "\n");
		System.out.format("%-9s %9s", Class2, Grade2 + "\n");
		System.out.format("%-9s %9s", Class3, Grade3 + "\n");
		System.out.format("%-9s %9s", Class4, Grade4 + "\n");
		System.out.format("%-9s %9s", Class5, Grade5 + "\n");
		
		System.out.print("1. Calculate your grade average\n" + "2. End program\n" + "What would you like to do? ");
		int AverageCalculator = input.nextInt();
		System.out.println("");
		if (AverageCalculator == 1)  {
			double Average = (Grade1 + Grade2 + Grade3 + Grade4 + Grade5) / 5;
			System.out.print("Your average is " + Average + "%!");
		} else {
			System.out.print("Progam ended.");
		
		}

	}

}
