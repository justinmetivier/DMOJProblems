package dmoj;

import java.util.Scanner;

public class ExactlyElectrical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int dist = sc.nextInt();
		
		
		int distance=(Math.abs(x2-x1)+Math.abs(y2-y1));
		
		if (dist==distance) {
			System.out.println("Y");

		}	else if (dist > distance && (dist-distance)%2==0) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		}
	}

