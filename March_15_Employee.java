package javaFundamentals;

public class March_15_Employee {
	int Id;
	String name;
	String department;
	String workplocation = "Banglore";

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getWorkplocation() {
		return workplocation;
	}

	public void setWorkplocation(String workplocation) {
		this.workplocation = workplocation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		March_15_Employee e1 = new March_15_Employee();
		e1.setId(1212);
		e1.setName("nita");
		e1.setDepartment("Mechanical");
		System.out.println(e1.Id);
		System.out.println(e1.name);
		System.out.println(e1.department);
		System.out.println(e1.workplocation);
		System.out.println();
		March_15_Employee e2 = new March_15_Employee();
		e2.setId(1233);
		e2.setName("komal");
		e2.setDepartment("Computer");
		System.out.println(e2.Id);
		System.out.println(e2.name);
		System.out.println(e2.department);
		System.out.println(e2.workplocation);
		System.out.println();
		March_15_Employee e3 = new March_15_Employee();
		e3.setId(1244);
		e3.setName("archu");
		e3.setDepartment("trainee");
		System.out.println(e3.Id);
		System.out.println(e3.name);
		System.out.println(e3.department);
		System.out.println(e3.workplocation);
	}



}
