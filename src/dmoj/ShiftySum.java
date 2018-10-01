package dmoj;

import java.util.Scanner;

public class ShiftySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count =0;
		int total = 0;
		int[] shift;
		shift = new int[b+1];
		for (count=0;count<b+1;count++) {
			int num = (int) (a*Math.pow(10,count));
			 total = total +num;
		}
		System.out.println(total);
	}
}
