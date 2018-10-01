package dmoj;

import java.util.Scanner;

public class AmeriCanadian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = "";
		String b = "";
		String c = "";

		
		int counter =0;
		
		do {
			a = sc.nextLine();
			int l = a.length();
			
			if(a.compareTo("quit!")!=0) {
				if ((l>4)&&a.contains("or")&&((a.charAt(l-3)!='a'))&&((a.charAt(l-3)!='e'))
						&&((a.charAt(l-3)!='i'))&&((a.charAt(l-3)!='o'))&&((a.charAt(l-3)!='u'))
						&&((a.charAt(l-3)!='y'))) {
					
					b = a.substring(0, l-2)+"our";
				
				} else  {
				b = a;
				}
			
			c += b+"\n";
			}
		} while (a.compareTo("quit!")!=0);
	
		System.out.println(c);
	}

}
