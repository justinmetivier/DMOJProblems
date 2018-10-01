package dmoj;

import java.util.Scanner;

public class TriangleTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a+b+c==180) {
		if ((a==b||a==c||b==c)&&!(a==b&&a==c)) {
			System.out.println("Isosceles");
		} else if (a==b&&a==c) {
			System.out.println("Equilateral");
		} else {
			System.out.println("Scalene");
		}
		} else {
			System.out.println("Error");
		}
	}

}
