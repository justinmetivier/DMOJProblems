package dmoj;

import java.util.Scanner;

public class RotatingLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] word;
		word = new char[a.length()];
		int wordCount=0;
		
		for(int i=0; i<a.length(); i++) {
			word[i]=a.charAt(i);
			if (word[i]=='I'||word[i]=='O'||word[i]=='S'||word[i]=='H'||word[i]=='Z'||word[i]=='X'||word[i]=='N') {
				wordCount++;
			}
		}
		if (wordCount==a.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}

}
