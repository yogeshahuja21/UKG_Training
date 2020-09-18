package Lab2b.ques1;

import java.math.BigDecimal;

public class SalariedEmployee extends EmployeeDetails{

	public static BigDecimal rate;
	public SalariedEmployee(int id,String name,String department,BigDecimal rate) {
		super(id,name,department);
		SalariedEmployee.rate=rate;
	}
	public SalariedEmployee() {
		
	}
	
	@Override
	public BigDecimal getSalary() {
		// TODO Auto-generated method stub
		return rate;
	}
	public static void increaseSalary(int increament) {
		BigDecimal increamentbd=new BigDecimal(increament);
		rate=rate.add(increamentbd);
		
	}
}