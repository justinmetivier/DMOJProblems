package dmoj;

import java.util.Scanner;

public class NextInLine {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int diff = (b-a);
		int c = b+diff;
		System.out.println(c);
		
	}

}
