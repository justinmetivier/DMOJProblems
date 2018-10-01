package dmoj;

import java.util.Scanner;

public class APlusB {
	public static void main (String[] Args) {
	Scanner sc = new Scanner (System.in);
	int count =0;
	int count1=0;
	
	int a = sc.nextInt();
		int[] array;
		
		array = new int[a];
		
		for (count=0;count<array.length;count++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			array[count]=b+c;
		}
		for (count1=0;count1<array.length;count1++) {
			System.out.println(array[count1]);
		}
	
	}
}
