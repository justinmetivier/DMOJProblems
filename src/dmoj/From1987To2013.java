package dmoj;

import java.util.Scanner;

public class From1987To2013 {
	static boolean distinct(int year) {
		int ones = year%10;
		int tens = (year%100 - ones)/10;
		int hundreds = (year%1000 - tens - ones)/100;
		int thousands = (year%10000 - hundreds - tens - ones)/1000;
		int hundedthou = (year%100000 - thousands - hundreds - tens - ones)/10000;
		
		if (ones != tens && ones != hundreds && ones != thousands && tens != hundreds 
				&& tens != thousands && hundreds != thousands&&ones!=hundedthou&&tens != hundedthou && 
				hundreds != hundedthou && thousands != hundedthou ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
			int startYear = sc.nextInt();
	
			
			do {
				startYear++;
			} while (distinct(startYear) == false);
			System.out.println(startYear);
	}

}
