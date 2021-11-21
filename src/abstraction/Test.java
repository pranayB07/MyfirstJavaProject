package abstraction;

public class Test {
	
	//we cannot create object of an abstract class.
	
	//we can call the non abstract method of abstract class by using the child class object
	//here we can call nonabstactMethod() by using the childclass object referance.
	//those are firefox driver and chrome driver
	
	public static void main(String[] args) {
		ChromeDriver c=new ChromeDriver();
		c.nonAbstractMethod();
		
		//with polymorphic referance you cant call the childcalss methods(imp)
		//here if you use webdriver referance you cant call chromedriver methods	
	}

}
