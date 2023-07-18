package oops;

class encapsulation 
{
	private String name;
	private int age;
	//getName method

	public String getName() 
	{
		return name;
	}
	//setName method

	public void setName(String name)
	{
		this.name = name;
	}
	//getAge method

	public int getAge()
	{
		return age;
	}
	//getAge method

	public void setAge(int age) 
	{
		this.age = age;
	}

	  public void setRoll(int i) {
		// TODO Auto-generated method stub
		
	}

	public String getRoll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	}

class encap
{

	public static void main(String[] args)
	{
		//Creating instance of class Encapsulation
				encapsulation e=new encapsulation();
				
				//Setting values
				e.setName("Pooja");
				e.setAge(23);
				
				//Print values
				System.out.println("Name is:" + e.getName());
				System.out.println("Age is:" + e.getAge());
	}
}
