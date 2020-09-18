package Lab3.ques6;

import java.util.Scanner;


public class ques6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter the limit to get numbers ");
		int limit=sc.nextInt();
		InputException inex=new InputException(limit);
		while (true) {
			System.out.println("Please Enter a number or enter '-1' if you want to Quit ");
			try {
				number = sc.nextInt();
				if(number>inex.getN())
				{
					inex.setMsg("Number Can't be Greater than "+inex.getN());
					throw inex;
					
				}
			} catch (InputException ex) {
				System.out.println("Exception : "+ex.getMsg());
				System.out.println("Enter the number again \n ");
				continue;

			}
			if(number==-1)break;
			System.out.println("Number was OK \n");
		}
		sc.close();
	}

}