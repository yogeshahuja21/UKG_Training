package Lab2b.ques2;

import java.math.BigDecimal;

public class CommissionEmployee extends Employee {
	
	
	private static BigDecimal rate;
	private BigDecimal sale;
	public CommissionEmployee(int id,String name,String department,BigDecimal rate,BigDecimal sale) {
		super(id,name,department);
		CommissionEmployee.rate=rate;
	}

	public static void increaseSalary(int increament) {
		BigDecimal increamentbd=new BigDecimal(increament);
		rate=rate.add(increamentbd);
		
	}

	@Override
	public double getPayment() {
		this.display();
		System.out.println("Salary : "+rate.multiply(sale).doubleValue());
		return rate.multiply(sale).doubleValue();
		
	}

	@Override
	void setSalary(double rate) {
		CommissionEmployee.rate=new BigDecimal(rate);
		
	}

	@Override
	double getSalary() {
		return rate.multiply(sale).doubleValue();
		
	}

}