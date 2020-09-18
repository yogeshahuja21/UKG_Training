package Lab2b.ques2;

import java.math.BigDecimal;

public class SalariedEmployee extends Employee{

	public static BigDecimal rate;
	public SalariedEmployee(int id,String name,String department,BigDecimal rate) {
		super(id,name,department);
		SalariedEmployee.rate=rate;
	}
	public SalariedEmployee() {
		
	}
	public static void increaseSalary(int increament) {
		BigDecimal increamentbd=new BigDecimal(increament);
		rate=rate.add(increamentbd);
		
	}
	@Override
	public double getPayment() {
		this.display();
		System.out.println("Salary : "+rate.doubleValue());
		return rate.doubleValue();
	}
	@Override
	void setSalary(double rate) {
		SalariedEmployee.rate=new BigDecimal(rate);
		
	}
	@Override
	double getSalary() {
		return rate.doubleValue();
		
	}
}