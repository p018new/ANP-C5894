package oops;
//Example of Single level inheritance
//super class or base class or parent class
class animal 
{
//fields & methods
	String name;
	public void eat()
	{
		System.out.println("Animal Eat....");
	}
}
//inherit from Animal
class Dog extends animal
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	public void sound()
	{
		System.out.println("Dog Barks....");
	}
}
class animalMain
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Dog d=new Dog();
		
		//access fields and methods
		d.name="Moti";
		d.eat();
		d.sound();
	}
}

