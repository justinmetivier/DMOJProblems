package dmoj;

import java.util.Scanner;

public class Calender {
	public static void main(String[] args) {
		String a = "";
		String b = "";
		String c = "";
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int days = sc.nextInt();
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		System.out.print("  ");

		for (int blank = 0; blank < start - 1; blank++) {
			a = a + "    ";
		}

		System.out.print(a);
		for (int cal = 1; cal <= days; cal++) {
			if ((cal / 10) >= 1) {
				b = "  ";
				c = " "
;			} else {
				b = "   ";
				c = "  ";
			}

			if ((start + cal - 2) % 7 == 0) {
				System.out.print("\n");
				
				System.out.print(c+cal +b);
			} else {
				System.out.print(cal +b);
			}
		}
	}
}
