import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		int reversedNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		sc.close();

		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
		}

		System.out.println("Reversed Number: " + reversedNum);
	}
}
