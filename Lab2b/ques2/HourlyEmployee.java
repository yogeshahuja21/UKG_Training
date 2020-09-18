package Lab2b.ques2;

import java.math.BigDecimal;

public class HourlyEmployee extends Employee{

	private static BigDecimal rate;
	private int hours;
	public HourlyEmployee(int id,String name,String department,BigDecimal rate,int hours) {
		super(id,name,department);
		this.hours=hours;
		HourlyEmployee.rate=rate;
	}
	public HourlyEmployee() {
		
	}
	public static void increaseSalary(int increament) {
		BigDecimal increamentbd=new BigDecimal(increament);
		rate=rate.add(increamentbd);
		
	}
	@Override
	public double getPayment() {
		this.display();
		System.out.println("Salary : "+rate.multiply(new BigDecimal(hours)).doubleValue());
		return rate.multiply(new BigDecimal(hours)).doubleValue();
	}
	@Override
	void setSalary(double rate) {
		HourlyEmployee.rate=new BigDecimal(rate);
		
	}
	@Override
	double getSalary() {
		return rate.multiply(new BigDecimal(hours)).doubleValue();
	}

	
}