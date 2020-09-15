package Lab2.ques3;

public class CurrentAccount extends Account{
	private int tradeLicenseNumber;
	public CurrentAccount(String memberName, String accountNumber, double accountBalance,int tradeLicenceNumber) {
		super(memberName, accountNumber, accountBalance);
		this.tradeLicenseNumber=tradeLicenceNumber;
	}
	
	public int getTradeLicenseNumber() {
		return tradeLicenseNumber;
	}

	public void setTradeLicenseNumber(int tradeLicenseNumber) {
		this.tradeLicenseNumber = tradeLicenseNumber;
	}

	@Override
	public double GetBalance() {
		return accountBalance;
	}

	@Override
	public void WithDraw(double amtwithdraw) {
		if(accountBalance-amtwithdraw<0)
		{
			System.out.println("Insufficient Balance to WithDraw ");
			
		}
		else
		{
			accountBalance-=amtwithdraw;
			System.out.println("Amount deducted Successfully :) ");
		}
		
	}

}
