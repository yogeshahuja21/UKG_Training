package Lab3.ques5;

import java.util.Scanner;

public class ques5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		while (true) {
			System.out.println("Please Enter a number or enter '-1' if you want to Quit ");
			try {
				number = sc.nextInt();
				if(number>100)
				{
					throw new GreaterThanHundredException("Number Can't be Greater than 100");
				}
			} catch (GreaterThanHundredException ex) {
				System.out.println("Exception : "+ex.getMessage());
				System.out.println("Enter the number again \n ");
				continue;

			}
			if(number==-1)break;
			System.out.println("Number was OK \n");
		}
		sc.close();
	}
}