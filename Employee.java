package constructors;
// Define the class name and the attributes
public class Employee {
    // Use private keyword to make the attributes only accessible within the class
    private String name;
    private int ID;
    private double salary;
    private String department;

    // Create a constructor that takes the values for the attributes as parameters
    public Employee(String name, int ID, double salary, String department) {
        // Use this keyword to assign the attributes to the current instance
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        this.department = department;
    }

    // Optionally, create another constructor that takes no parameters and assigns default values
    public Employee() {
        this.name = "(not set)";
        this.ID = 0;
        this.salary = 0.0;
        this.department = "(not set)";
    }

    // Optionally, create getter and setter methods for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Optionally, override the toString method to return a string representation of the employee object
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
// Add a closing curly brace for the class Employee

// Create a main method to test the class


    public static void main(String[] args) {

        // Create an instance of the class using the constructor that takes parameters
        Employee emp1 = new Employee("Alice", 123, 5000.0, "Sales");

        // Print the instance
        System.out.println(emp1);

        // Access an attribute using getter method
        System.out.println(emp1.getName()); // Alice
       
        // Create another instance of the class using the constructor that takes parameters
        Employee emp2 = new Employee("Charlie", 456, 4000.0, "Marketing");

        // Print the instance
        System.out.println(emp2);

        // Access an attribute using getter method
        System.out.println(emp2.getDepartment()); // Marketing

        // Modify an attribute using setter method
        emp2.setSalary(4500.0);
        System.out.println(emp2.getSalary()); // 4500.0
    }
}
   