package important;

import java.util.Scanner;

public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number or String");
		String names = sc.nextLine();
		String name = names.replace(" ", "");
		int lentgh = name.length();
		String reverse = "";
		for (int i = lentgh - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		// System.out.println(reverse);
		if (name.equals(reverse)) {
			System.out.println(reverse + " is a palindrome");
		} else {
			System.out.println(reverse + " is not a palindrome");
		}

	}

}
