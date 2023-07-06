package oops;
class shape 
{

	public void calculateArea() {
		System.out.println("Calculate area pf the shape");
	}

}
//Rectangle class
class rectangle extends shape{
	@Override
	public void calculateArea() {
		System.out.println("Calculating area of a rectangle");
		//calculate and print the area of a rectangle
		
	}
}