package Lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		while (true) {
			System.out.println("Please Enter a number or enter '-1' if you want to Quit ");
			try {
				number = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("You must Enter the integer number\n ");
				continue;

			}
			
			if(number==-1)break;
			
			if (number % 2 == 0) {
				System.out.println("Even\n");
			} else {
				System.out.println("Odd\n");
			}
		}
	}
}