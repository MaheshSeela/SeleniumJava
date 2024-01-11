package Strings;

import java.util.Scanner;

public class StringwordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String names = sc.nextLine();
		int count = 0;
		for (int i = 0; i < names.length() - 1; i++) {
			if (names.charAt(i) == ' ' && Character.isLetter(names.charAt(i + 1)) && (i > 0)) {
				count++;
			}
		}
		count++;
		System.out.println(count);
		sc.close();

	}

}
