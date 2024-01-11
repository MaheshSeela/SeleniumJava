package important;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int x = 0, y, temp;
		temp = num;
		while (num > 0) {
			y = num % 10; // (153%10 = 3)
			num = num / 10;
			x = x + (y * y * y);
		}
		if (temp == x) {
			System.out.println(temp + " is a armstrong");
		} else {
			System.out.println(temp + " is not a armstrong");
		}
		sc.close();
	}

}
