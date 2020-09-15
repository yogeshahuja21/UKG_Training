package Lab2.ques3;

public class SavingsAccount extends Account{
	private int interest=5;
	private double maxLimit;
	public SavingsAccount(String memberName, String accountNumber, double accountBalance, double maxLimit) {
		super(memberName, accountNumber, accountBalance);
		this.maxLimit = maxLimit;
	}
	public double getMaxLimit() {
		return maxLimit;
	}
	public void setMaxLimit(double maxLimit) {
		this.maxLimit = maxLimit;
	}
	@Override
	public double GetBalance() {
		System.out.println("Considering time of 1 year : ");
		return ((accountBalance*interest*1)/100)+accountBalance;
		
		
	}
	@Override
	public void WithDraw(double amtwithdraw) {
		if(accountBalance-amtwithdraw<500) {
			System.out.println("Not Allowed since minimum balance must be 500");
		}
		else if(amtwithdraw>maxLimit)
		{
			System.out.println("Amount greater then Max Limit ");
		}
		else
		{
			accountBalance-=amtwithdraw;
			System.out.println("Thank you amount withdrawn Successfully from your Savings Account ");
		}
	}
	
}
