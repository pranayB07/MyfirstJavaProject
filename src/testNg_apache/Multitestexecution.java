package testNg_apache;

import org.testng.annotations.Test;

public class Multitestexecution 
{
  @Test
  public void deposit()
  {
	  System.out.println("Deposit test is successful..");
  }
  @Test
  public void Login() 
  {
	  System.out.println("Login test is successful...");
  }
 
  @Test
  public void signout() 
  {
	  System.out.println("signout test is successful...");
  }
  @Test
  public void withdraw() 
  {
	  System.out.println("withdraw test is successful...");
  }
  
}
