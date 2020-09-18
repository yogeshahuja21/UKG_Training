package Lab2b.ques1;

abstract public class EmployeeDetails implements Employee {
	private int id;
	private String name;
	private String department;
	public EmployeeDetails(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public EmployeeDetails() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void display()
	{
		System.out.println("Employee ID :"+id);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Department :"+department);
	}

	
}