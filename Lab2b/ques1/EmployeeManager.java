package Lab2b.ques1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		showoptions();
		Scanner sc = new Scanner(System.in);
		int prompt = sc.nextInt();
		while (prompt != 0) {
			int id = 0;
			String name="";
			String dept="";
			if (prompt == 1 || prompt == 2 || prompt == 3) {
				System.out.print("Enter the Id of Employee ");
				id = sc.nextInt();
				System.out.print("Enter the Name of Employee ");
				name = sc.next();
				System.out.print("Enter the Department of Employee ");
				dept = sc.next();
			}
			BigDecimal rate = null;
			switch (prompt) {
			case 1:
				System.out.print("Enter the rate of Employee ");
				rate = new BigDecimal(sc.nextInt());
				EmployeeDetails salariedemp = new SalariedEmployee(id, name, dept, rate);
				employees.add(salariedemp);
				break;
			case 2:
				System.out.print("Enter the rate of Employee ");
				rate = new BigDecimal(sc.nextInt());
				System.out.print("Enter the hours worked of Employee ");
				int hours = sc.nextInt();
				EmployeeDetails hourlyemp = new HourlyEmployee(id, name, dept, rate, hours);
				employees.add(hourlyemp);
				break;
			case 3:
				System.out.print("Enter the rate of Employee ");
				rate = new BigDecimal(sc.nextInt());
				System.out.print("Enter the sale of Employee ");
				int sale = sc.nextInt();
				EmployeeDetails commemp = new HourlyEmployee(id, name, dept, rate, sale);
				employees.add(commemp);
				break;
			case 4:
				for (Employee emp : employees) {
					emp.display();
					System.out.println("Salary : " + emp.getSalary());
					System.out.println("-----------------------------------------------------");
				}
				break;
			case 5:
				System.out.println("Enter 1 to increase rate of Salaried Employee :");
				System.out.println("Enter 2 to increase rate of Hourly Employee :");
				System.out.println("Enter 3 to increase rate of Commissioned Employee :");
				int op = sc.nextInt();
				System.out.println("Please Enter the rate to get increamented :");
				int inc = sc.nextInt();
				if (op == 1) {
					SalariedEmployee.increaseSalary(inc);
				} else if (op == 2) {
					HourlyEmployee.increaseSalary(inc);
				} else if (op == 3) {
					CommissionEmployee.increaseSalary(inc);
				} else {
					System.out.println("Please Choose from above Options only :)");
				}
				break;
			}
			showoptions();
			prompt = sc.nextInt();
		}
		sc.close();

	}

	private static void showoptions() {
		System.out.println("Enter your Choice ");
		System.out.println("Enter 1 to Add Salaried Employee");
		System.out.println("Enter 2 to Add Hourly Employee");
		System.out.println("Enter 3 to Add Comissioned Employee");
		System.out.println("Enter 4 to see Details of Employee");
		System.out.println("Enter 5 to Increase salary of Employee");
		System.out.println("Enter 0 to when finished Adding Employees");
	}
}