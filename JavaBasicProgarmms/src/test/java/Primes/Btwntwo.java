package Primes;

import java.util.Scanner;

public class Btwntwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int start = sc.nextInt();
		System.out.println("Enter the Second number");
		int end = sc.nextInt();
		int count = 0;
		for (int i = start; i < end; i++) {
			if (prime(i)) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		System.err.println("The prime numbers between " +start+" and "+end+" is: "+count);
		sc.close();

	}

	public static boolean prime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
