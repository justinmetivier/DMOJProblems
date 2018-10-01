package dmoj;

import java.util.Scanner;

public class QuadrentSelection {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int quad =0;
		
		if (a>=0&&b>=0) {
			quad =1;
		} else if (a<=0&&b>=0) {
			quad =2;
		} else if (a<=0&&b<=0) {
			quad =3;
		} else if (a>=0&&b<=0) {
			quad =4;
		}
		System.out.println(quad);
		
	}
}
