package Primes;

import java.util.Scanner;

public class Method1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num;
		boolean prime = true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				prime = false;
				break;
			}
		}
		if(prime) {
		System.out.println(temp+" is a prime number");
		}
		else {
			System.out.println(temp+" is not a Prime number");
		}
	}

}
