package Lab1;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		int numStudent;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number Of Students : ");
		numStudent=sc.nextInt();
		double sum=0.0;
		for(int i=0;i<numStudent;)
		{
			System.out.print("Enter the Grade For Student "+(i+1)+" : ");
			int Grade=sc.nextInt();
			if(Grade>0 && Grade<=100)
			{
				i++;
				sum+=Grade;
			}
			else {
				System.out.println("Invalid grade,try again...");
			}
		}
		sc.close();
		System.out.println("The Average is : "+(sum/numStudent));

	}

}
