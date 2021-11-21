package javapractice;

public class Methods1 
{

	public static void myMethod() 
	{
		System.out.println(" I just got executed");
	}
	
	public static void myMethod2()
	{
		System.out.println("You called a method from myMethod2");
	}
	public static void main(String[] args)
	{
		
		Methods1.myMethod();
		Methods1.myMethod2();
		
		//we dont need to create an object to call static methods and variables
		//by using classname we can directly call the varibles and methods
		
		

	}

}
