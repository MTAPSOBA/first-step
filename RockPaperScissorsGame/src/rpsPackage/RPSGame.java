package rpsPackage;
import java.util.Random;
import java.util.Scanner;

public class RPSGame {

	public static void main(String[] args) {
String[] rps = {"R","P","S"}; 
		String computerMove =rps[new Random().nextInt(rps.length )];
		
		Scanner Scan = new Scanner(System.in); 
		String PlayerMove;
		
		while( true) {
		System.out.println("Please Enter your move");
	     PlayerMove = Scan.next(); 
		if(PlayerMove.equals("R")|| PlayerMove.equals("P")||PlayerMove.equals("S"))
			break;
		System.out.println(PlayerMove + "is not a valid Move.");
		}

		System.out.println(" computerMove: " +computerMove);
		
		if (PlayerMove.equals(computerMove)) {
			System.out.println("The Game is tie!");}
		
		
		else if (PlayerMove.equals("R")) { if (computerMove.equals("P")) {
			System.out.println("you lose!");}
		
		else if (PlayerMove.equals("P")) { if (computerMove.equals("R")) {
			System.out.println("you Win!");}
		
		else if (PlayerMove.equals("S")) { if (computerMove.equals("R")) {
			System.out.println("you Win!");}
		
						
	}
}
}}}