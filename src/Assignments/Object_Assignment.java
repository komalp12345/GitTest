package Assignments;

public class Object_Assignment 
{

	
	int x = 30;
	int y = 40;
	int z = 50;
	
	void addition()
	{
	int a = 20;
	System.out.println("Addition of x and a is");
	System.out.println(x+a);
	
	}
	
	void substraction()
	{
	int b = 10; 
	System.out.println("Substraction of x and v is");
	System.out.println(y-b);
	}
	     
	void multiplication()
	{
		int v = 100;
		System.out.println("Multiplication of x and v is");
	System.out.println(x*v);	
	
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Object_Assignment obj = new Object_Assignment();                                                                    
		obj.addition();
		obj.substraction();
		obj.multiplication();
		
	}
}
