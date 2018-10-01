package dmoj;

import java.util.Scanner;

public class VoteCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String vote = sc.nextLine();
		int aCount = 0;
		int bCount = 0;
		
		//char[]votes = new char[num];
		for (int count=0; count<num; count++) {
			char letter = vote.charAt(count);
			if(letter =='A') {
				aCount++;
			} else if (letter == 'B') {
				bCount++;
			}
		}
		if (aCount>bCount) {
			System.out.println("A");
		} else if (bCount>aCount) {
			System.out.println("B");
		} else {
			System.out.println("tie");
		}
	}

}
