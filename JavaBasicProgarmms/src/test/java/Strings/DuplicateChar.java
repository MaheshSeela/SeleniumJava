package Strings;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String names = sc.nextLine();
		String name = names.replace("\\s", "");
		int count = 0;
		char[] dup = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (dup[i] == dup[j]) {
					System.out.println(dup[j]);
					count++;
					break;
				}
			}
		}
		System.out.println("same alphabet/number is repated "+count+" times");
		sc.close();
	}

}
