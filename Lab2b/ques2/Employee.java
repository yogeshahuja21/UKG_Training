package Lab2b.ques2;

abstract public class Employee implements Payable {

	private int id;
	private String name;
	private String department;
	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public Employee() {}
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
	abstract double getSalary();
	abstract void setSalary(double rate);
}