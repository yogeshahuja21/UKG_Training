package Lab2b.ques1;
import java.math.BigDecimal;

public class HourlyEmployee extends EmployeeDetails{
	private static BigDecimal rate;
	private int hours;
	public HourlyEmployee(int id,String name,String department,BigDecimal rate,int hours) {
		super(id,name,department);
		this.hours=hours;
		HourlyEmployee.rate=rate;
	}
	public HourlyEmployee() {
		
	}
	@Override
	public BigDecimal getSalary() {
		return rate.multiply(new BigDecimal(hours));
	}
	public static void increaseSalary(int increament) {
		BigDecimal increamentbd=new BigDecimal(increament);
		rate=rate.add(increamentbd);
		
	}

}
