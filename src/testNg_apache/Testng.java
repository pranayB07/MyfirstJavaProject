package testNg_apache;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng {
	
  @Test(groups="1st")
  public void firstTest() 
  {
	  System.out.println("First test is successful");
  }
  
  @Test(groups="1st")
  public void secondTest() 
  {
	  System.out.println("Second test is excecuted");
  }
  
  @Test(groups="1st")
  public void thirdTest() 
  {
	  System.out.println("Third test is excecuted");
  }
  
  @Test(priority=1,groups="2nd")
  @Parameters({"name","age"})
  
  public void fourthTest(String name, int age)
  {
	  System.out.println(name +" age is " + age);
  }
  
  @Test(priority=2,groups="2nd")
  @Parameters({"place"})
  public void fifthTest(String place) 
  {
	  System.out.println("He is from " + place);
  }
}
