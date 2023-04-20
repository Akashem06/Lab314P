import java.util.Scanner;

public class TicTac {
public static void main(String[] args) {
	
	Scanner TicTacToe = new Scanner(System.in);
	
	boolean XOCheck = true;
	boolean GameTypeCheck = true;
	String GameType = "";
	String Square1 = "1";
	String Square2 = "2";
	String Square3 = "3";
	String Square4 = "4";
	String Square5 = "5";
	String Square6 = "6";
	String Square7 = "7";
	String Square8 = "8";
	String Square9 = "9";
	
	
	System.out.println("Welcome to Tic Tac Toe!\n" + "In this game you will select which square you'd like to place your X/O by using the numbers that correspond to this square: \n");
	
	System.out.format(" %10s %10s %10s", "__________", "__________", "__________");
	System.out.format("\n" + "|%10s|%10s|%10s|", "", "", "");
	System.out.format("\n" + "|%10s|%10s|%10s|", Square1 + "     " , Square2 + "     ", Square3 + "     ");
	System.out.format("\n" + "|%10s|%10s|%10s|", "__________", "__________", "__________");
	System.out.format("\n" + "|%10s|%10s|%10s|", "", "", "");
	System.out.format("\n" + "|%10s|%10s|%10s|", Square4 + "     " , Square5 + "     ", Square6 + "     ");
	System.out.format("\n" + "|%10s|%10s|%10s|", "__________", "__________", "__________");
	System.out.format("\n" + "|%10s|%10s|%10s|", "", "", "");
	System.out.format("\n" + "|%10s|%10s|%10s|", Square7 + "     " , Square8 + "     ", Square9 +"     ");
	System.out.format("\n" + "|%10s|%10s|%10s|", "__________", "__________", "__________");
	System.out.print("\n");
	while (GameTypeCheck) {
		
	System.out.print("\n" + "1. AI\n" + "2. Human Player\n\n" + "Who would you like to play against: ");
	GameType = TicTacToe.nextLine();
	GameTypeCheck = !GameType.equals("1") && !GameType.equals("2"); }
	
	switch(GameType) {
	case "1":
		while (XOCheck) {
		System.out.print("\n" + "Would you like to be X or O (X goes first): ");
		String XO = TicTacToe.nextLine().toUpperCase();
		XOCheck = !XO.equals("X") && !XO.equals("O");}
		break;
	case "2":
		
		break;
	}
}
}
