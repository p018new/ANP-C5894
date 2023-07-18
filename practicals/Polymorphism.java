package oops;

 class Polymorphism {
	 
	
	
			
		public int sum(int a,int b) 
		{
			return a*b;
		}
		public int sum(int a,int b,int c) 
		{
			return a*b*c;
		}
		public double sum(double a,double b) 
		{
			return a*b;
		}
	}
	class PolymorphismMain
	{
		public static void main(String[] args)
		{
			Polymorphism p=new Polymorphism();
			System.out.println("The sum is :" + p.sum(150,180));
			System.out.println("The sum is :" + p.sum(25,42,30));
			System.out.println("The sum is :" + p.sum(42.50,12.00));
		}
	}


