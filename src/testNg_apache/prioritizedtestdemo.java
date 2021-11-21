package testNg_apache;

import org.testng.annotations.Test;

public class prioritizedtestdemo 
{
	 @Test(priority=2)
	  public void deposit()
	  {
		  System.out.println("Deposit test is successful..");
	  }
	 
	  @Test(priority=1)
	  public void Login() 
	  {
		  System.out.println("Login test is successful...");
	  }
	  
	  //disabiling sinout test
	  @Test(priority=4,enabled=false)
	  public void signout() 
	  {
		  System.out.println("signout test is successful...");
	  }
	  
	  //disabiling withdraw test
	  @Test(priority=3,enabled=false)
	  public void withdraw() 
	  {
		  System.out.println("withdraw test is successful...");
	  }
}
