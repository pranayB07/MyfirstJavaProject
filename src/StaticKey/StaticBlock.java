package StaticKey;

public class StaticBlock {
	
	//static blocks will excecute even before main method
	
	static
	{
		System.out.println("static block1 is executed");
	}
	static
	{
		System.out.println("static block2 is executed");
	}
	static
	{
		System.out.println("static block3 is executed");
	}


	
	public static void main(String[] args) {
		
		System.out.println("Main method");
	}
	
	
	static
	{
		System.out.println("static block4 is executed");
	}


}
