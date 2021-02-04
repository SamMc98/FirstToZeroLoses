package Java_Challenges;

import java.util.Random;
import java.util.Scanner;

public class Game_to_get_to_0 {

	public static void main(String[] args) {       		

		Random ran = new Random();
		int MainNum = ran.nextInt(11) + 20; //the exclusive range added onto the second integer so 20 to 30
		int Ans = MainNum;
		int Num = 0;
		int CompNum = 0;

		System.out.println("Main number is " + MainNum);

		while (Ans > 0) {

			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("\nHow many do want to remove? Between 1 and 3");
			Num = input.nextInt();
			if (Num > 3 || Num < 1) {
				System.out.println("Invalid input.");
			}
			else {
				Ans = Ans - Num;
				if (Ans <= 0) {
					System.out.println("Computer Wins!");
				}
				else {
					System.out.println("Number is at " + Ans);	    	           

					Random Compran = new Random();
					CompNum = Compran.nextInt(2) + 1; //removes between 1 and 3
					System.out.println("\nComputer removes " + CompNum);
					Ans = Ans - CompNum;
					if (Ans <= 0) {
						System.out.println("You Win!");
					}
					else {
						System.out.println("Number is at " + Ans);
					}
				}
			}
		}
	}
}