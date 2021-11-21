package javapractice;

import java.util.Scanner;

public class Methods2 {
	
	static int myMethod(int x,int y)
	{
		return x + y;
	}

	public static void main(String[] args) 
	{
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Please Enter your number X");
		int x=sc.nextInt();
		System.out.println(" Please Enter your Number Y");
		int y=sc.nextInt();
		int z=myMethod(x,y);
		
		System.out.println("The sum of " + x + " and " + y + " is : " + z );
	 

	}

}

