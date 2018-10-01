package dmoj;

import java.util.Scanner;

public class SpeedFinesAreNotFine {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int limit = sc.nextInt();
		int speed = sc.nextInt();
		
		int speeding = (speed - limit);
		int dollars = 0;
		if (speeding <=0) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else {
			if (speeding >0 && speeding <=20) {
				dollars = 100;
			} else if (speeding >20 && speeding <=30) {
				dollars = 270;
			} else{
				dollars = 500;
			}
			System.out.println("You are speeding and your fine is $" + dollars +".");
		}
	}

}
