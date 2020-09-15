package Lab2.ques3;

abstract class Account {
	protected String memberName;
	protected String accountNumber;
	protected double accountBalance;
	
	public double getAccountBallance() {
		return accountBalance;
	}
	public Account(String memberName, String accountNumber, double accountBalance) {
		this.memberName = memberName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	abstract double GetBalance();
	abstract void WithDraw(double amtwithdraw);

	public void Deposit(double amtdeposit)
	{
		accountBalance+=amtdeposit;
		System.out.println("Deposited Successfully ");
	}
}

