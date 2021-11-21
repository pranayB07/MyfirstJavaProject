package constructors;

public class Parameter_Constructors {
	
	String name;
	String place;
	int age;
	
	public Parameter_Constructors(String name, String place, int age)
	{
		this.name=name;
		this.place=place;
		this.age=age;
		
		
		//this keyword is used to call the current class variables and methods
		
	}
	
	public void StudentDetail()
	{
		System.out.println("The name of the student is " + name);
		System.out.println("The place : " + place);
		System.out.println("Age : " + age);
	}
	

}
