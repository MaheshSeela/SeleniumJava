package Swap;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A and B Values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println(a + " " + b);
		sc.close();
	}

}
