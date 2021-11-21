package SuperKeyword;

public class Dog extends Animal {
	
	public Dog(int i)
	{
		System.out.println("Dog constructor");
	}
	

	public void nameofAnimal()
	{
		super.nameofAnimal();
		System.out.println("The animal name is Dog");
	}

	public void sound()
	{ 
		super.sound();
		System.out.println("Dog sound");
	}
	

}
