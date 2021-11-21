package testNg_apache;

import org.testng.annotations.Test;

public class MultitestDemo {
	
	
  @Test(priority=1)
  public void login() {
	  System.out.println("Login Test Script is Excecuted..");
  }
  
  @Test(priority=4,enabled=false)
  public void signOut() {
	  System.out.println("signOut Test Script is Excecuted..");
  }
  
  @Test(priority=3)
  public void withdraw() {
	  System.out.println("withdraw Test Script is Excecuted..");
  }
  
  @Test(priority=2)
  public void deposit() {
	  System.out.println("deposit Test Script is Excecuted..");
  }
}
