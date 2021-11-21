package RA_encapsulation;

public class Bank
{
	public int accountNo=123456;
	private int pinNo=1234;
	private double balanceAmount=100000;
	
	public void withdrawAmount(int accNo , int pin , int amount)
	{
		if (accNo==accountNo && pin==pinNo)
		{
			if(amount<=balanceAmount)
			{
				balanceAmount=balanceAmount-amount;
				System.out.println("The amount withdrawn : " + amount);
				System.out.println("The remaining funds in your account are : " + balanceAmount);
			}
			else
			{
				System.out.println("Insuffiecient funds");
			}
		}
		else
			System.out.println("You entered invalid credentials..");
	}
	
	public void updatePin(int accNo,int oldpin, int newpin)
	{
		if(accNo==accountNo && oldpin==pinNo)
		{
			pinNo=newpin;
			System.out.println("Pin updated sucessfully..");
		}
		else
			System.out.println("Invalid credentials...");
	}
	
	public double depositCash(int accNo, int pin , int amount)
	
	{
		if (accNo==accountNo && pin==pinNo)
		{
			balanceAmount=balanceAmount+amount;
			return balanceAmount;
		}
		else
			System.out.println("Invalid credentials..");
			return balanceAmount;
		
	}
	
}
