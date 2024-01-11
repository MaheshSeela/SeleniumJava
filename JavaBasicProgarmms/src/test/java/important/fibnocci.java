package important;

import java.util.Scanner;

public class fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (10 = 0+1=1, 1+2=3, 3+5=8, 8
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int a = 0, b = 0, c = 1;
		for (int i = 0; i < num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}
		sc.close();
	}

}
