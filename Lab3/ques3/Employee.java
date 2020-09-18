package Lab3.ques3;


import java.io.Serializable;

public class Employee implements Serializable {
	private String id;
	private String name;
	private String Address;
	transient private double salary;
	public Employee(String id, String name, String address, double salary) {
		this.id = id;
		this.name = name;
		Address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", Address=");
		builder.append(Address);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
