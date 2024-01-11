package Strings;

import java.util.Scanner;

public class Stringcount2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String names = sc.nextLine();
		String name = names.replace(" ", "");
		int count = 0;
		for (int i = name.length() - 1; i >= 0; i--) {
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
