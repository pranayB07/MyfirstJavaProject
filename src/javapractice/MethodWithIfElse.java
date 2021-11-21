package javapractice;

import java.util.Scanner;

public class MethodWithIfElse 
{

	static void checkAge(int age)
	{
		if(age<18)
		{
			System.out.println("Access Denied,Your age should be more than 18");
		}
		else
			System.out.println("Access Granted, You are above 18 years");
	}
	public static void main(String[] args) 
	{
	
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please Enter your age");
		int age=sc.nextInt();
		checkAge(age);
		
	}

}
