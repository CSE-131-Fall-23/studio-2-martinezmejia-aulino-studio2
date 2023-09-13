package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		//User inputs
		Scanner in = new Scanner(System.in);
		System.out.println("How much money are you gambling with today?");
		int startAmount = in.nextInt();
		System.out.println("What is the win chance of a single play?");
		double winChance = in.nextDouble();
		System.out.println("What do you consider to be a successful day?");
		int winLimit = in.nextInt();
		System.out.println("How many days do you want to play?");
		int totalSimulations = in.nextInt();
		int days = 0;
		int losses = 0;

		for (int i=0; i < totalSimulations; i++){
			int balance = startAmount;
			int plays = 0;
			while ((balance<winLimit) && (balance>0)) {
				double randomNumber = Math.random();
				if (randomNumber>winChance) {
					balance = balance - 1;
					//System.out.println("YOU FAILED " + balance);
				}else {
					balance = balance + 1;
					//System.out.println("YAYYYYYY " + balance);
				}
				plays = plays+1;
			}
			days = days+1;
			if (balance == 0) {
				System.out.println("Day " + days + ": Ruined day in " + plays + " plays");
				losses++;
			}
			if (balance == winLimit) {
				System.out.println("Day " + days + ": Successful day in " + plays + " plays");
			}


		}
		System.out.println("Losses: " + losses);
	}

}
