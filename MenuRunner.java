package sahil;

import java.util.Scanner;

public class MenuRunner {

	public int calculator(int a, int b, int c) {
		switch (c) {
		case 1:
			return a + b;
		case 2:
			return a - b;
		case 3:
			return a / b;
		case 4:
			return a * b;

		default:
			System.out.println("Please enter a valid choice");
			return -1;

		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println("Enter another number :");
		int b = sc.nextInt();
		System.out.println("Choices available are :");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");

		System.out.println("Enter your choice: ");
		int c = sc.nextInt();

		MenuRunner m = new MenuRunner();

		System.out.println("Answer : " + m.calculator(a, b, c));

	}

}
