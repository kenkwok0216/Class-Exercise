package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input number: ");
		int n = scan.nextInt();

		if (n == 1) {
			System.out.println("Monday");
		} else if (n == 2) {
			System.out.println("Tuesday");
		} else if (n == 3) {
			System.out.println("Wednesday");
		} else if (n == 4) {
			System.out.println("Thursday");
		} else if (n == 5) {
			System.out.println("Friday");
		} else if (n == 6) {
			System.out.println("Saturday");
		} else if (n == 7) {
			System.out.println("Sunday");
		}

		scan.close();
	}

}