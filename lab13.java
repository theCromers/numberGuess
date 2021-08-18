package lab13;

import java.util.Random;
import java.util.Scanner;

public class lab13 { // must include do while loop
	public static void main (String[] args) {
		Random num = new Random();
		int game = num.nextInt(100-1+1)+1; //game is the number randomly generated
		Scanner input = new Scanner(System.in);
		int user = 0;
	do {
		System.out.println("Make your guess: ");
		user = input.nextInt(); //input of the user
		if(game < user) {
			System.out.println("Your guess was too high. Please try again.");
		}else if(game > user ) {
			System.out.println("Your guess was too low. Please try again.");
		}
		
	} while (game != user);
	
	System.out.println("Your guess was correct. Congrats!");
	}
}
