package oops;

class personn1 {
	public String name;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
 class Employee1 extends personn1{
	private double salary;
public double getSalary() {
	return salary;
	
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
 class Manager extends Employee1{
	private String department;
	

public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
}
 class Active
{
	public static void main(String[]args) {
		Manager m = new Manager();
		m.setName("Damon Salvatore");
		m.setAge(28);
		m.setSalary(50000);
		m.setDepartment("Senior Head");
		
		System.out.println("Name:" +m.getName());
		System.out.println("Age:" +m.getAge());
		System.out.println("Salary:" +m.getSalary());
		System.out.println("Department:" +m.getDepartment());
	}

}
 