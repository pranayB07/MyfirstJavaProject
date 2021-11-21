package RA_Overriding;

public class Firefoxdriver extends Webdriver {
	
	public void click()
	{
		System.out.println("Clicking on Firefox");
	}
	public void sendkeys()
	{
		System.out.println("SendingKeys on Firefox");
	}
}
