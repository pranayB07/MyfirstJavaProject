package RA_encapsulation;

public class Atm {

	public static void main(String[] args) {
		
		Bank obj=new Bank();
		//obj.updatePin(123456, 1234, 2345);
		//obj.withdrawAmount(123456, 1234, 1000);
		double amount=obj.depositCash(123456, 1234, 4000);
		System.out.println(amount);
		
		
		
		
	}

}
