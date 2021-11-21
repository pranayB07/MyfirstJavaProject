package javapractice;

import java.util.Scanner;

import bsh.This;

public class MethodWithIfElsePractice {
	
	public static MethodWithIfElsePractice m=new MethodWithIfElsePractice();
	public  void checkAge(int age)
	{
		if(age>=18)
		{
			System.out.println("Wecome to Betway");
		}
		else
			System.out.println("Access denied , Your age is less than 18");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		m.checkAge(age);
		
		
	}

}
