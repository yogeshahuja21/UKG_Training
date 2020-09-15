package Lab2.ques3;

import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Account account = null;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Username of the Account Holder ");
		String username=sc.next();
		System.out.println("Enter the Type of Account 1 for Savings, 2 for Current ");
		int Accounttype=sc.nextInt();
		System.out.print("Enter the Initial Balance ");
		double balance;
		balance=sc.nextDouble();
		while(balance<500 ) {System.out.println("Insufficient Balance ");balance=sc.nextDouble();}
		Random rand = new Random();
		String accountnum ="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+
		rand.nextInt(10)+ rand.nextInt(10);
		if(Accounttype==1)
		{
			System.out.print("Enter the Max Limit of transaction of your Account ");
			double maxlimit=sc.nextDouble();
			account =new SavingsAccount(username, accountnum, balance, maxlimit);
			
		}
		else if(Accounttype==2)
		{
			System.out.print("Enter the trade Licence number ");
			int tradelicencenumber=sc.nextInt();
			account =new CurrentAccount(username, accountnum, balance, tradelicencenumber);
		}
		else
		{
			System.out.println("Enter the correct Account type ");
		}
		
		optionchooser();
		int prompt=sc.nextInt();
		while(prompt!=0)
		{
			switch (prompt){
			case 1:
				System.out.println("Enter the Amount to Deposit : ");
				double amtdeposit=sc.nextDouble();
				account.Deposit(amtdeposit);
				break;
			case 2:
				System.out.println("Enter the Amount to WithDraw : ");
				double amtwithdraw=sc.nextDouble();
				account.WithDraw(amtwithdraw);
				break;
			case 3:
				System.out.println("Account Balance : "+account.GetBalance());
				break;
			}
			optionchooser();
			if(sc.hasNextInt())
			prompt=sc.nextInt();
		}
	}
	public static void optionchooser() {
		System.out.println("Enter '1', to deposit money in account: ");
		System.out.println("Enter '2', to withdraw money from account : ");
		System.out.println("Enter '3', to display Balance  ");
		System.out.println("Enter '0', to exit the system : ");
	}


}
