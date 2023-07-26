package Pra;

import java.util.Scanner;

public class EvenOddPrac1 {

	public static void main(String args[]) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();

		if (s1 % 2 != 0) {
			System.out.println("odd");
		} else {
			System.out.println("Even");
		}

	}

}
