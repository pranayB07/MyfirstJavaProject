package constructors;

public class Students {

	//constructors have the same name as the class name
	
	public Students() {
	
	System.out.println("The Constructor of Students Class is called");
		
	}
	
	public static void main(String[] args) {
		Students s=new Students();
		//as soon as you create the object of class, the constructor will be automatically called
	}
	
	public void method()
	{
		System.out.println("method of the Students class");
	}
}
