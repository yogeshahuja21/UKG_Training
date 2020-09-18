package Lab2b.ques1;
import java.math.BigDecimal;

public class CommissionEmployee extends EmployeeDetails {
	
	
	private static BigDecimal rate;
	private BigDecimal sale;
	public CommissionEmployee(int id,String name,String department,BigDecimal rate,BigDecimal sale) {
		super(id,name,department);
		CommissionEmployee.rate=rate;
	}
	
	@Override
	public BigDecimal getSalary() {
		return rate.multiply(sale);
	}

	public static void increaseSalary(int increament) {
		BigDecimal increamentbd=new BigDecimal(increament);
		rate=rate.add(increamentbd);
		
	}

}