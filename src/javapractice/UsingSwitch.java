package javapractice;

import java.util.Scanner;

public class UsingSwitch {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int day=sc.nextInt();
		
		switch(day)
		{
		case 1:
		System.out.println("Today is monday");
		break;
		
		case 2:
			System.out.println("Today is tuesday");
			break;
		case 3:
			System.out.println("Today is wednesday");
			break;
		case 4:
			System.out.println("Today is thursday");
			break;
		default:
			System.out.println("There is no day associated with your number..");
		}

	}

}
