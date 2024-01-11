package important;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
		sc.close();
		
		// Manual Method
		int n = 6;
		int j = 1;
		long facto = 1;
		while (n >= j) {
			facto = facto * j;
			j++;
		}
		System.out.println("Factorial of " + n + " is " + facto);

	}

}
