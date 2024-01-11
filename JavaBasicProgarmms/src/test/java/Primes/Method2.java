package Primes;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		int temp = num;
		if (prime(num)) {
			System.out.println(temp + " is a prime number");
		} else {
			System.out.println(temp + " is not a prime number");
		}
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
