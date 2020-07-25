import java.util.Scanner;

public class game{
	//Takes in Contender's Name and prints a Welcome message
	static{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Contender's name: ");
		String player=sc.nextLine();
		System.out.println();
		System.out.println("Welcome "+player+"! Let's Play **TIC-TAC-TOE**");
		System.out.println();
	}
	public static void main(String[] args){
		
		//Creating Game-Board:
		char[][] gBoard={{' ','|',' ','|',' '},
				{'~','+','~','+','~'},
				{' ','|',' ','|',' '},
				{'~','+','~','+','~'},
				{' ','|',' ','|',' '}};
	
		//Printing Game-Board:
		for(char[] l:gBoard){
			for(char k:l){
				System.out.print(k);
			}
			System.out.println();
		}

		//Take user input for pos1 and randomize for pos2

		//Insert 0 and X at positions selected

		//game logic for player winning,cpu winning and tie
	}
} 