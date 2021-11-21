package SuperKeyword;

import org.testng.annotations.Test;

public class Bulldog extends Dog {
	
	public Bulldog()
	{
		super(2);
		System.out.println("Bulldog constructor");
	}
	@Test
	public void callingSuperClassMethods()
	{
		super.nameofAnimal();
		
	}
	
	//if we dont call a constructor of a super class the compiler implicitely calls -
	//the default construcor of super class, if the constructor overloaded we need to explicitely
	//call the method by using the super keyword.
}
