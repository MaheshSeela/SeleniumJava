package important;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp, rem, fact, sum = 0;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum += fact;
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println(temp + " is a strong number");
		} else {
			System.out.println(temp + " is not a strong number");
		}
		sc.close();
	}

}
