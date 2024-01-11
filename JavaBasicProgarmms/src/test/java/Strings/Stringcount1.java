package Strings;

import java.util.Scanner;

public class Stringcount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String names = sc.nextLine();
		String name = names.replace(" ", "");
		int length = name.length();
		System.out.println(length);
		sc.close();
	}

}
