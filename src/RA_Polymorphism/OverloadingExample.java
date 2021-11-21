package RA_Polymorphism;

public class OverloadingExample {
	
	
	
	public static void main(String[] args) {
		
		OverloadingExample obj=new OverloadingExample();
		obj.add(0, 0);  //for adding two numbers
		obj.add(0, 0, 0); // for adding three numbers
	}
	
	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a , int b , int c)
	
	{
		System.out.println(a+b+c);
	}


}
