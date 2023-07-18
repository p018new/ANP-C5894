package oops;

public class person {

	
		private String name;
		private int age;
		//getter and setter for name
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
		public static void main(String[]args) {
			//create an instance of the person class
			person p = new person();
			
			//set the name and age using the setter method
			p.setName("Pooja");
			p.setAge(23);
			//Access the name and age 
			String name= p.getName();
			int age=p.getAge();
			
			//print the name and age
			System.out.println("Name:" + name);
			System.out.println("Age:" + age);
			
			
	}

}
